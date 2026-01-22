// Last updated: 22/01/2026, 14:30:24
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) { val = x; }
7 * }
8 */
9class Solution {
10    public void deleteNode(ListNode node) {
11        
12        ListNode next = node.next;
13
14        node.val = next.val;
15        node.next = next.next;
16
17    }
18}