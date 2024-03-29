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
    public ListNode swapPairs(ListNode head) {
        return swap(head);
     
    }

    public ListNode swap(ListNode head){

        if(head == null || head.next == null){
            return head;
        }

        ListNode prev = head;
        ListNode cur = head.next;

        ListNode temp = swap(cur.next);

        prev.next=temp;
        cur.next=prev;
        
        return cur;
    }
}