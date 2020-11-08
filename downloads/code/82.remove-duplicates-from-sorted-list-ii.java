/*
 * @lc app=leetcode id=82 lang=java
 *
 * [82] Remove Duplicates from Sorted List II
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        // assume [0, l] are nums to keep
        // r is current pointer
        // pre is always one ahead of l
        ListNode pre = dummy, l = head, r = head;
        int cnt = 0;
        while (r != null) {
            if (l.val == r.val) {
                r = r.next;
                cnt++;
            } else {
                if (cnt >= 2) {
                    pre.next = r;
                    l = r;
                } else {
                    pre = l;
                    l = l.next;
                }
                cnt = 0;
            }
        }
        if (cnt >= 2) {
            pre.next = r;
            l = r;
        }
        return dummy.next;
    }
}

