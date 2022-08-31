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
    public void reorderList(ListNode head) {
         
      find(head);
        return ;
            
    }
    
    ListNode find(ListNode root){
        
        if(root.next==null){
            return root;
        }
      
        ListNode last = root;
        ListNode prev = null;
        
        while(last.next!=null){
            prev=last;
            last=last.next;
        }
        
        prev.next=null;
        if(root.next!=null)
        last.next= find(root.next);
        root.next=last;
        
        return root;
    }
}