// Last updated: 26/02/2026, 01:57:42
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
17    int diameter =0;
18    public int diameterOfBinaryTree(TreeNode root) {
19        
20        height(root);
21        return diameter;
22    }
23
24    private int height(TreeNode root){
25        if(root== null) return 0;
26        if(root.left==null && root.right==null){
27            return 1;
28        }
29        int h1 = height(root.left);
30        int h2 = height(root.right);
31
32        diameter = Math.max(diameter,h1+h2);
33
34        return 1+ Math.max(h1,h2);
35    } 
36}