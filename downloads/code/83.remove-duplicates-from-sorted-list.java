/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
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
        ListNode l = head, r = head;
        while (r!=null) {
            if (l.val == r.val) {
                r = r.next;
            } else {
                l = l.next;
                l.val = r.val;
            }
        }
        l.next = null;
        return head;
    }
}

