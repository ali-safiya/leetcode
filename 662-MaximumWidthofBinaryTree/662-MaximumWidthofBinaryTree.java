// Last updated: 26/02/2026, 03:48:22
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
16
17class Solution {
18    class Node{
19        TreeNode treenode;
20        int index;
21
22        public Node(TreeNode treenode, int index){
23            this.treenode=treenode;
24            this.index=index;
25        }
26    }
27    public int widthOfBinaryTree(TreeNode root) {
28        Queue<Node> q = new ArrayDeque<>();
29
30        int maxWidth =0;
31
32        q.add(new Node(root,1));
33
34        while(!q.isEmpty()){
35
36            int size = q.size();
37            int left =0;
38            int right =0;
39            for(int i=0;i<size;i++){
40                Node cur = q.poll();
41                if(i==0) left = cur.index;
42                if(i==size-1) right = cur.index;
43                if(cur.treenode.left!=null){
44                    q.add(new Node(cur.treenode.left,2*cur.index));
45                }
46                if(cur.treenode.right!=null){
47                    q.add(new Node(cur.treenode.right,2*cur.index+1));
48                }
49            }
50            maxWidth = Math.max(maxWidth, right-left+1);
51        }
52        return maxWidth;
53    }
54}