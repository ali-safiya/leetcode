// Last updated: 05/02/2026, 17:20:15
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
12    public ListNode rotateRight(ListNode head, int k) {
13
14        if (head == null || head.next == null || k == 0)
15            return head;
16            
17        ListNode temp = head;
18        int length = 0;
19
20        while(temp.next!=null){
21            temp=temp.next;
22            length++;
23        }
24        length++;
25
26        temp.next = head;
27        int i =0;
28        while(i < length -(k%length)-1 ){
29            head= head.next;
30            i++;
31        }
32        ListNode newTail = head.next;
33        head.next =null;
34        return newTail;
35        
36    }
37}