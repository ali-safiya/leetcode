// Last updated: 23/01/2026, 15:53:02
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
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13
14        ListNode dummy = new ListNode(0,head);
15        ListNode temp = dummy;
16        ListNode jump = dummy;
17        int counter =0;
18
19        while(temp.next!=null){
20            temp=temp.next;
21            counter++;
22
23            if(counter > n){
24                jump=jump.next;
25            }
26        }
27
28        jump.next=jump.next.next;
29        return dummy.next;
30    }
31}