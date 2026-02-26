// Last updated: 27/02/2026, 03:43:13
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
17    public boolean isSymmetric(TreeNode root) {
18        
19        if(root.left == null && root.right == null) return true;
20
21        if(root.left == null || root.right == null) return false;
22
23        if(root.left.val!= root.right.val) return false;
24
25        return findSymmetry(root.left,root.right);
26    }
27
28    private boolean findSymmetry(TreeNode t1, TreeNode t2){
29
30        if(t1 == null && t2 == null) return true;
31
32        if(t1 == null || t2 == null) return false;
33
34        return t1.val == t2.val && findSymmetry(t1.left, t2.right) && findSymmetry(t1.right,t2.left);
35    }
36}