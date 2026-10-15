// Last updated: 16/10/2026, 01:50:40
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
14       ListNode dummy = new ListNode();
15       dummy.next = head;
16
17       ListNode slow = dummy;
18       ListNode fast = dummy;
19
20       int counter = n+1;
21       while(counter-- > 0){
22            fast = fast.next;
23       }
24        
25        while(fast!=null){
26            slow=slow.next;
27            fast= fast.next;
28        }
29
30       slow.next= slow.next.next;
31
32       return dummy.next;
33    }
34}