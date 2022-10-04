/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        int len1=0,len2=0;
        
        ListNode head1=headA;
        ListNode head2=headB;
        
        while(head1!=null){
            head1=head1.next;
            len1++;
        }
        
        while(head2!=null){
            head2=head2.next;
            len2++;
        }
        
        if(len1>len2){
            int diff= len1-len2;
            head1=headA;
            head2=headB;
            while(diff>0){
                head1=head1.next;
                diff--;                
            }
        }
        else{
            int diff= len2-len1;
            head1=headA;
            head2=headB;
            while(diff>0){
                head2=head2.next;
                diff--;     
            }
            
        }
        int n =Math.min(len1,len2);
        for(int i=0;i<n;i++){
            
            if(head1==head2)
                return head1;

            head1=head1.next;
            head2=head2.next;
         }
        
        return null;
    }
}