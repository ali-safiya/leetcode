// Last updated: 01/03/2026, 02:58:37
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
17
18    int index =0;
19    public TreeNode bstFromPreorder(int[] preorder) {
20
21        return construct(preorder,Integer.MAX_VALUE);
22        
23    }
24
25    private TreeNode construct(int[] preorder, int bound){
26
27        if(index == preorder.length || preorder[index] > bound) return null;
28
29        TreeNode root = new TreeNode(preorder[index++]);
30
31        root.left = construct(preorder,root.val);
32        root.right = construct(preorder,bound);
33
34        return root;
35    }
36}