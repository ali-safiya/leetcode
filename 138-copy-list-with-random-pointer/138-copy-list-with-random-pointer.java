/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        Node temp = head;
        
        while(temp!=null){
            
            Node nxt = temp.next;
            Node newNode = new Node(temp.val);
            
            temp.next= newNode;
            newNode.next = nxt;
            
            temp=nxt;
        }
        
        temp = head;
        while(temp!=null){
            if(temp.random!=null){
                temp.next.random=temp.random.next;
            }
            temp=temp.next.next;
        }
        
        temp=head;
        Node head1= new Node(0);
        Node copy=head1;
        while(temp!=null){
            
            Node nxt=temp.next.next;
            
            copy.next=temp.next;
            copy=temp.next;
            
            temp.next=nxt;
            temp=nxt;
            
        }
        return head1.next;

        
    }
}