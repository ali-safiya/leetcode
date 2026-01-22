// Last updated: 22/01/2026, 15:37:05
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
12    public boolean isPalindrome(ListNode head) {
13
14        if(head == null || head.next == null) return true;
15
16        ListNode slow = head;
17        ListNode fast = head;
18
19        while(fast.next!=null && fast.next.next!=null){
20            slow= slow.next;
21            fast= fast.next.next;
22        }
23
24        ListNode rev =reverse(slow.next);
25        ListNode middle = rev;
26
27        slow= head;
28        while(rev !=null){
29            if(rev.val!=slow.val) return false;
30            rev= rev.next;
31            slow = slow.next;
32        }
33        reverse(middle);
34        return true;
35    }
36
37    private ListNode reverse(ListNode fast){
38        ListNode prev =null;
39        ListNode temp = fast;
40
41        while(temp!=null){
42            ListNode front = temp.next;
43            temp.next= prev;
44            prev = temp;
45            temp=front;
46        }
47        return prev;
48    }
49}