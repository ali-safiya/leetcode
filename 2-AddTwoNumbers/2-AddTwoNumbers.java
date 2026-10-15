// Last updated: 16/10/2026, 02:06:33
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
14        ListNode newList = new ListNode(0);
15        ListNode head = newList;
16
17        ListNode temp1 = l1;
18        ListNode temp2 = l2;
19        int carry =0;
20
21        while(temp1!=null && temp2!= null){
22
23            int sum = (temp1.val + temp2.val + carry)%10;
24            carry = (temp1.val + temp2.val + carry )/10;
25
26            ListNode newNode = new ListNode(sum);
27            head.next= newNode;
28            head= newNode;
29
30            temp1= temp1.next;
31            temp2= temp2.next;
32        }
33
34        while(temp1!=null){
35            int sum = (temp1.val + carry)%10;
36            carry = (temp1.val  + carry )/10;
37
38            ListNode newNode = new ListNode(sum);
39            head.next= newNode;
40            head= newNode;
41
42            temp1= temp1.next;
43
44        }
45
46        while(temp2!=null){
47            int sum = (temp2.val + carry)%10;
48            carry = (temp2.val  + carry )/10;
49
50            ListNode newNode = new ListNode(sum);
51            head.next= newNode;
52            head= newNode;
53
54            temp2= temp2.next;
55
56        }
57
58        if(carry!=0){
59           ListNode newNode = new ListNode(carry);
60            head.next= newNode;
61        }
62
63        return newList.next;
64    }
65}