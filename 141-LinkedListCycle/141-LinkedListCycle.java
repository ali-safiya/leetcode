// Last updated: 22/01/2026, 17:29:12
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
13    public boolean hasCycle(ListNode head) {
14
15        if(head== null) return false;
16
17        ListNode slow =head;
18        ListNode fast = head;
19
20        do{
21            if(fast.next == null || fast.next.next== null){
22                return false;
23            }
24            slow= slow.next;
25            fast= fast.next.next;
26
27        }while(slow!=fast);
28
29        return true;
30        
31    }
32}