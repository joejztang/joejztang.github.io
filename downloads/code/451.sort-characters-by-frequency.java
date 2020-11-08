/*
 * @lc app=leetcode id=451 lang=java
 *
 * [451] Sort Characters By Frequency
 *
 * https://leetcode.com/problems/sort-characters-by-frequency/description/
 *
 * algorithms
 * Medium (56.71%)
 * Likes:    772
 * Dislikes: 69
 * Total Accepted:    101K
 * Total Submissions: 178.2K
 * Testcase Example:  '"tree"'
 *
 * Given a string, sort it in decreasing order based on the frequency of
 * characters.
 * 
 * Example 1:
 * 
 * Input:
 * "tree"
 * 
 * Output:
 * "eert"
 * 
 * Explanation:
 * 'e' appears twice while 'r' and 't' both appear once.
 * So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid
 * answer.
 * 
 * 
 * 
 * Example 2:
 * 
 * Input:
 * "cccaaa"
 * 
 * Output:
 * "cccaaa"
 * 
 * Explanation:
 * Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer.
 * Note that "cacaca" is incorrect, as the same characters must be together.
 * 
 * 
 * 
 * Example 3:
 * 
 * Input:
 * "Aabb"
 * 
 * Output:
 * "bbAa"
 * 
 * Explanation:
 * "bbaA" is also a valid answer, but "Aabb" is incorrect.
 * Note that 'A' and 'a' are treated as two different characters.
 * 
 * 
 */
class Pair {
    public int fre;
    public char c;
    public Pair(int fre, char c) {
        this.fre = fre;
        this.c = c;
    }
}

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> frq = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(46, new Comparator<Pair>() {
            @Override
            public int compare(Pair a, Pair b) {
                if (a.fre > b.fre) return -1;
                else if (a.fre == b.fre) return 0;
                else return 1;
            }
        });
        
        for (int i = 0; i<s.length(); i++) {
            if (frq.putIfAbsent(s.charAt(i), 1) != null) {
                frq.put(s.charAt(i), frq.get(s.charAt(i))+1);
            }
        }
        
        for (Character ch : frq.keySet()) {
            Pair tmp = new Pair(frq.get(ch), ch);
            pq.offer(tmp);
        }
        
        StringBuilder sb = new StringBuilder();
        while (pq.size() != 0) {
            Pair tmp = pq.poll();
            for (int i = 0; i<tmp.fre; i++) sb.append(tmp.c);
        }
        
        return sb.toString();
    }
}

