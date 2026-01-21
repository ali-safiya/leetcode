// Last updated: 21/01/2026, 14:55:30
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
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13
14        ListNode cur1 = list1;
15        ListNode cur2 = list2;
16
17        ListNode newList = new ListNode();
18        ListNode head2 = newList;
19
20        while(cur1 != null && cur2 !=null){
21
22            if(cur1.val < cur2.val){
23                ListNode temp = new ListNode(cur1.val);
24                temp.next = null;
25                newList.next = temp;
26                newList= newList.next;
27                cur1 = cur1.next;
28            }
29            else{
30                ListNode temp = new ListNode(cur2.val);
31                newList.next = temp;
32                temp.next = null;
33                newList= newList.next;
34                cur2 = cur2.next;   
35            }
36        }
37
38        while(cur1!= null){
39            ListNode temp = new ListNode(cur1.val);
40            newList.next = temp;
41            temp.next = null;
42            newList= newList.next;
43            cur1 = cur1.next;
44        }
45
46        while(cur2!=null){
47            ListNode temp = new ListNode(cur2.val);
48            newList.next = temp;
49            temp.next = null;
50            newList= newList.next;
51            cur2 = cur2.next;   
52        }
53
54        return head2.next;
55    }
56}