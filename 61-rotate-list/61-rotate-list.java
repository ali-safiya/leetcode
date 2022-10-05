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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next==null ||  k==0)
            return head;
        int len=0;
        
        ListNode temp=head;
        
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        
        int rotations = k%len;
        
        if(rotations == 0)
            return head;
        ListNode last = head;
        int i=len- rotations-1;
       
        while(i>0){
            last=last.next;
            i--;
        }
        
        ListNode first = last.next;
        temp= last.next;
        
        rotations--;
        while(rotations>0){
            temp=temp.next;
            rotations--;
        }
        last.next=null;
        temp.next=head;
        head=first;
        
        
        return head;
        
    }
}