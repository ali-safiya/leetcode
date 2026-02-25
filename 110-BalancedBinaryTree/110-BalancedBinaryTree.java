// Last updated: 26/02/2026, 02:23:34
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
17    public boolean isBalanced(TreeNode root) {
18
19        return height(root)!=-1;
20        
21    }
22
23    private int height(TreeNode root){
24        if(root==null) return 0;
25
26        int h1 = height(root.left);
27        if(h1==-1) return -1;
28        int h2=  height(root.right);
29        if(h2==-1) return -1;
30
31        if(Math.abs(h1-h2) > 1) return -1;
32
33        return 1+Math.max(h1,h2);
34    }
35}