// Last updated: 01/03/2026, 02:33:27
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public Node left;
6    public Node right;
7    public Node next;
8
9    public Node() {}
10    
11    public Node(int _val) {
12        val = _val;
13    }
14
15    public Node(int _val, Node _left, Node _right, Node _next) {
16        val = _val;
17        left = _left;
18        right = _right;
19        next = _next;
20    }
21};
22*/
23
24class Solution {
25    public Node connect(Node root) {
26
27        if(root== null) return root;
28
29        Node leftmost = root;
30
31        while(leftmost.left!=null){
32
33            Node cur = leftmost;
34
35            while(cur!= null){
36
37                cur.left.next = cur.right;
38
39                if(cur.next!=null){
40                    cur.right.next = cur.next.left;
41                }
42                cur = cur.next;
43
44            }
45
46            leftmost = leftmost.left;
47        }
48        return root;
49    }
50}