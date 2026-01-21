// Last updated: 21/01/2026, 17:28:06
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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        
14        int carry =0;
15        ListNode dummy = new ListNode();
16        ListNode head = dummy;
17
18        while(l1 !=null || l2 != null){
19
20            int x = l1==null ? 0 : l1.val;
21            int y = l2==null ? 0 : l2.val;
22            int sum = x + y + carry;
23            carry =0;
24
25            if(sum>=10){
26                carry = sum / 10;
27                sum %= 10;
28            }
29            ListNode temp = new ListNode(sum);
30            head.next = temp;
31            temp.next = null;
32            head =temp;
33            l1=(l1==null? null : l1.next);
34            l2=(l2==null? null : l2.next);
35        }
36
37        if(carry !=0){
38            ListNode temp = new ListNode(carry);
39            head.next = temp;
40            temp.next = null; 
41        }
42        return dummy.next;
43    }
44}