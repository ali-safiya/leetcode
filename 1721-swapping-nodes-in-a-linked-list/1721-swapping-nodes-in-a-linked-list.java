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
    public ListNode swapNodes(ListNode head, int k) {
      
        
        ListNode left =head;
        ListNode right =head;
        
        int i=1;
        
        while(left.next!=null){
            if(i==k)
                break;
            left=left.next;
            i++;
        }
        
        ListNode itr =left;
        
        while(itr.next!=null){
            itr=itr.next;
            right=right.next;
        }
        
        int temp=left.val;
        left.val=right.val;
        right.val=temp;
        
        return head;
    }
}