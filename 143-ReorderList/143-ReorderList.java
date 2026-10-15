// Last updated: 15/10/2026, 23:26:30
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
12    public void reorderList(ListNode head) {
13
14        ListNode slow = head;
15        ListNode fast = head.next;
16        ListNode temp = head;
17
18        while(fast!= null && fast.next!=null){
19            slow=slow.next;
20            fast=fast.next.next;
21        }
22
23        ListNode head2 = slow.next;
24        slow.next = null;
25        head2 = reverse(head2);
26
27
28        ListNode temp2 = head2;
29
30        while(temp2!=null){
31            
32            ListNode next = temp2.next;
33            temp2.next= temp.next;
34            temp.next = temp2;
35
36            temp = temp2.next;
37            temp2 = next;
38
39        }
40        
41    }
42    private ListNode reverse(ListNode head){
43        ListNode prev = null;
44        ListNode curr = head;
45
46        while(curr!=null){
47
48            ListNode next = curr.next;
49            curr.next = prev;
50            prev = curr;
51            curr = next;
52        }
53
54        return prev;
55    }
56}