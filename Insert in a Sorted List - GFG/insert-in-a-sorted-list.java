//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
	
    public static void main(String args[]) throws IOException { 
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0){
            int n = sc.nextInt();
            
            Node head = new Node(sc.nextInt());
            Node tail = head;
            
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            
            int k = sc.nextInt();
            
            Solution g = new Solution();
            head = g.sortedInsert(head,k);
            
            printList(head); 
            t--;
        }
    } 
} 

// } Driver Code Ends


/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/

// sortedInsert method should return the head of the modified linked list.
class Solution {
    Node sortedInsert(Node head1, int key) {
        // Add your code here.
        
        Node cur = head1;
        
        if(cur.data > key){
            Node temp = new Node(key);
            temp.next=cur;
            head1=temp;
            return head1;
        }
        Node prev =null;
        
        while(cur!=null){
            if(prev!=null)
            //  System.out.println(prev.data+" "+ cur.data);
            if(cur.data > key){
                
                insert(prev,cur,key);
                return head1;
            }

            prev=cur;
            cur= cur.next;
            
        }
     
        insert(prev,null,key);
        
        return head1;
    }
    private void insert(Node prev, Node cur,int key){
        
         Node temp = new Node(key);
         prev.next= temp;
         temp.next=cur;
    }
}





