// Last updated: 01/03/2026, 04:00:39
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public boolean findTarget(TreeNode root, int k) {
18        if(root == null) return false;
19
20        Stack<TreeNode> s1 = new Stack<>();
21        Stack<TreeNode> s2 = new Stack<>();
22
23        pushLeft(root,s1);
24        pushRight(root,s2);
25
26        TreeNode leftNode = getNextLeft(s1);
27        TreeNode rightNode = getNextRight(s2);
28
29        while(leftNode!=null && rightNode != null && leftNode!=rightNode){
30
31            int sum = leftNode.val + rightNode.val;
32
33            if (sum == k) return true;
34
35            if (sum < k) {
36                leftNode = getNextLeft(s1);
37            } else {
38                rightNode = getNextRight(s2);
39            }
40
41        }
42        return false;
43        
44    }
45
46    private TreeNode getNextLeft(Stack<TreeNode> stack){
47        if (stack.isEmpty()) return null;
48
49        TreeNode node = stack.pop();
50        pushLeft(node.right, stack);
51        return node;
52    }
53
54    private TreeNode getNextRight(Stack<TreeNode> stack){
55        if (stack.isEmpty()) return null;
56
57        TreeNode node = stack.pop();
58        pushRight(node.left, stack);
59        return node;
60    }
61
62    private void pushLeft(TreeNode root, Stack<TreeNode> s1){
63        while(root!=null){
64            s1.push(root);
65            root=root.left;
66        }
67    }
68     private void pushRight(TreeNode node, Stack<TreeNode> s2) {
69        while (node != null) {
70            s2.push(node);
71            node = node.right;
72        }
73    }
74}