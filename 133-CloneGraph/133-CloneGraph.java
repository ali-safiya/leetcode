// Last updated: 05/03/2026, 02:28:01
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> neighbors;
6    public Node() {
7        val = 0;
8        neighbors = new ArrayList<Node>();
9    }
10    public Node(int _val) {
11        val = _val;
12        neighbors = new ArrayList<Node>();
13    }
14    public Node(int _val, ArrayList<Node> _neighbors) {
15        val = _val;
16        neighbors = _neighbors;
17    }
18}
19*/
20
21class Solution {
22    public Node cloneGraph(Node node) {
23
24      if(node == null)   return null;
25      HashMap<Node,Node> visited = new HashMap<>();
26        return clone(node,visited);
27
28    }
29
30    private Node clone(Node node, HashMap<Node,Node> visited){
31        if(node == null ) return null;
32        if(visited.containsKey(node)) return visited.get(node);
33
34        Node copy = new Node(node.val);
35        visited.put(node,copy);
36
37        for(Node child : node.neighbors){
38            copy.neighbors.add(clone(child,visited));
39        }
40
41        return copy;
42    }
43}