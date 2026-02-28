// Last updated: 01/03/2026, 01:57:32
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
17    public boolean isValidBST(TreeNode root) {
18
19        return find(root,Long.MIN_VALUE,Long.MAX_VALUE);
20        
21    }
22
23    private boolean find(TreeNode root, long min , long max){
24        if(root == null) return true;
25
26        if(root.val <= min || root.val >= max) return false;
27
28        return find(root.left,min,root.val) && find(root.right,root.val,max); 
29    }
30}