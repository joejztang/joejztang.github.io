/*
 * @lc app=leetcode id=328 lang=java
 *
 * [328] Odd Even Linked List
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
    public ListNode oddEvenList(ListNode head) {
        if (head==null || head.next == null) return head;

        ListNode head2 = head.next;
        ListNode p1 = head, p2 = head2;

        while (p1.next!=null&&p2.next!=null) {
            p1.next = p1.next.next;
            p2.next = p2.next.next;

            p1 = p1.next;
            p2 = p2.next;
        }

        if (p2 == null || p2.next == null) {
            p1.next = null;
        }

        p1.next = head2;

        return head;
    }
}

