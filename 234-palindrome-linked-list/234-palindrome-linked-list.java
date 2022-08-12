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
    ListNode front ;
    public boolean isPalindrome(ListNode head) {
        front =head;
        return checkPalindrome(head);
        
    }
    boolean checkPalindrome(ListNode head){
        if(head == null)
            return true;
        
        
        if(!checkPalindrome(head.next))
            return false;
        
        if(front.val != head.val)
            return false;
        else
            front=front.next;
        return true;
    }
}