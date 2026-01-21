// Last updated: 21/01/2026, 13:46:52
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode reverseList(ListNode head) {
13        if(head == null || head.next == null) return head;
14        
15        ListNode newfront = reverseList(head.next);
16
17        ListNode front = head.next;
18        front.next = head;
19        head.next = null;
20
21        return newfront;
22        
23    }
24}