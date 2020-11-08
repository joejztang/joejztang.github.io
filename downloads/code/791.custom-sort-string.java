import java.util.Map;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode id=791 lang=java
 *
 * [791] Custom Sort String
 */
class Solution {
    public String customSortString(String S, String T) {
        // char -> index
        Map<Character, Integer> reg = new HashMap<>();
        for (int i = 0; i<S.length(); i++) {
            reg.put(S.charAt(i), i);
        }

        // customized comparator
        PriorityQueue<Character> pq = new PriorityQueue<>(new Comparator<Character>() {
            @Override
            public int compare(Character a, Character b) {
                int idxa = -1;
                int idxb = -1;
                if (reg.containsKey(a)) idxa = reg.get(a);
                if (reg.containsKey(b)) idxb = reg.get(b);
                if (idxa != -1 && idxb != -1) {
                    return idxa - idxb;
                } else if (idxa == -1) {
                    return 1;
                } else { // idxb == -1
                    return -1;
                }
            }
        });

        for (int i = 0; i<T.length(); i++) {
            pq.offer(T.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            sb.append(pq.poll());
        }

        return sb.toString();
    }
}

