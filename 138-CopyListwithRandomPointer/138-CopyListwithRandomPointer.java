// Last updated: 05/02/2026, 15:46:47
1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15
16class Solution {
17    public Node copyRandomList(Node head) {
18        
19        Node temp = head;
20
21        while(temp!=null){
22            Node temp2 = new Node(temp.val);
23            temp2.next= temp.next;
24            temp.next=temp2;
25            temp = temp2.next;
26        }
27
28        temp = head;
29
30        while(temp!=null){
31            Node temp2 = temp.next;
32            Node random = temp.random;
33            temp2.random = random == null? null : random.next;
34            temp = temp2.next;
35        }
36
37        Node dummy = new Node(-1);
38        Node head2 = dummy;
39        temp = head;
40        while(temp!=null){
41            Node temp2 = temp.next;
42            head2.next= temp2;
43            temp.next = temp2.next;
44            temp=temp2.next;
45            // temp2.next=temp.next;
46            head2=temp2;
47        }
48        return dummy.next;
49    }
50}