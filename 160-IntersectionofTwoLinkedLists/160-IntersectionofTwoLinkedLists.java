// Last updated: 23/01/2026, 12:11:14
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
14
15        int m = 0;
16        ListNode temp = headA;
17        while(temp!=null){
18            temp=temp.next;
19            m++;
20        }
21        int n=0;
22        temp = headB;
23        while(temp!=null){
24            temp=temp.next;
25            n++;
26        }
27        int diff = Math.abs(m-n);
28        ListNode first = headA;
29        ListNode sec = headB;
30        System.out.println(diff);
31        if(m>n){
32            while(diff-- > 0){
33                first=first.next;
34            }
35        }
36        else{
37            while(diff-- > 0){
38                sec=sec.next;
39            }
40        }
41        while(first!= null && sec!=null){
42            if(first == sec) return first;
43            first=first.next;
44            sec=sec.next;
45        }
46        return null;  
47    }
48}