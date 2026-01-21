// Last updated: 21/01/2026, 17:13:44
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
12     
13    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
14      
15      return findSum(l1,l2,0);
16     
17        
18    }
19    
20    ListNode findSum(ListNode l1, ListNode l2 , int carry){
21        
22        if(l1 == null && l2 == null){
23            if(carry !=0)
24                return new ListNode(carry);
25            return null;
26        }
27         
28        
29        int x = (l1 !=null ? l1.val : 0);
30        int y = (l2 !=null ? l2.val : 0);
31        
32        int sum = x+y+carry;
33        
34        carry = sum/10;
35        
36        l1= (l1==null? null : l1.next);
37         l2= (l2==null? null : l2.next);
38       
39        ListNode temp=  findSum(l1,l2,carry);
40        
41        ListNode ans  = new ListNode(sum%10);
42        
43        ans.next= temp;
44        return ans;
45        
46    }
47    
48}