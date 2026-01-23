// Last updated: 23/01/2026, 12:30:04
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14
15        if(head == null) return null;
16
17        ListNode slow = head;
18        ListNode fast = head;
19
20        do{
21            if(fast==null || fast.next==null) return null;
22            slow= slow.next;
23            fast= fast.next.next;
24        }while(slow!=fast);
25
26        slow= head;
27
28        while(slow!=fast){
29            fast=fast.next;
30            slow=slow.next;
31        }
32        return fast;
33    }
34}