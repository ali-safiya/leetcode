/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
     
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      
      return findSum(l1,l2,0);
     
        
    }
    
    ListNode findSum(ListNode l1, ListNode l2 , int carry){
        
        if(l1 == null && l2 == null){
            if(carry !=0)
                return new ListNode(carry);
            return null;
        }
         
        
        int x = (l1 !=null ? l1.val : 0);
        int y = (l2 !=null ? l2.val : 0);
        
        int sum = x+y+carry;
        
        carry = sum/10;
        
        l1= (l1==null? null : l1.next);
         l2= (l2==null? null : l2.next);
       
        ListNode temp=  findSum(l1,l2,carry);
        
        ListNode ans  = new ListNode(sum%10);
        
        ans.next= temp;
        return ans;
        
    }
    
}