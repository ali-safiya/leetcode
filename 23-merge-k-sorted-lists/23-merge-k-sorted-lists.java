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
    public ListNode mergeKLists(ListNode[] lists) {
    
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>((ListNode a,ListNode b)-> a.val- b.val);
        
        for( ListNode li: lists){
            if(li!=null)
            pq.add(li);
            //System.out.println(li.val);
        }  
        
        ListNode temp = new ListNode(-1);
        ListNode head= temp;
            
         while(!pq.isEmpty()){
             
             ListNode cur = pq.poll();
             
             temp.next= cur;
             temp=temp.next;
             if(cur.next!=null)
                 pq.add(cur.next);
         } 
        
        return head.next;
        
    }
}