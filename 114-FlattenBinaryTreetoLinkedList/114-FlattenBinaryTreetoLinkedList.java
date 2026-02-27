// Last updated: 28/02/2026, 03:14:25
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
17    TreeNode prev = null;
18    public void flatten(TreeNode root) {
19        
20        if(root == null) return;
21
22        flatten(root.right);
23        flatten(root.left);
24
25        root.right = prev;
26        root.left = null;
27
28        prev =root;
29    }
30}