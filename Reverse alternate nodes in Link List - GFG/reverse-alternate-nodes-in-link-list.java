//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Rearr
{
    static Node head;
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node temp = head;
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                temp.next = new Node(a);
                temp = temp.next;
            }
            
            Solution ob = new Solution();
            ob.rearrange(head);
            printLast(head);
            System.out.println();
        }
    }
    
    public static void printLast(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
// } Driver Code Ends


/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
class Solution
{
    public static void rearrange(Node odd)
    {
        // add your code here
         if (odd == null || odd.next == null) {
        return;
    }
        
        Node head = odd;
        Node even = odd.next;
        
        Node headOfEven = even;
        
        while(even!=null && even.next != null){
            
           odd.next=odd.next.next;
           even.next=even.next.next;
           odd=odd.next;
           even=even.next;
        }
        Node reverseNode = reverse(headOfEven);
        odd.next=reverseNode;
    }
    
    private static Node reverse(Node head){
        Node curNode= head;
        Node prev =null;
        while(curNode!=null){
            
            Node temp1 = curNode.next;
            curNode.next=prev;
            
            prev=curNode;
            curNode=temp1;
            
        }
        return prev;
    }
    
   
}
