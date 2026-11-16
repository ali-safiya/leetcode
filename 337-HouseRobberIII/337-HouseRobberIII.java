// Last updated: 16/11/2026, 07:06:51
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
17    public int rob(TreeNode root) {
18
19        int[] result = findLargestSum(root); 
20
21        return Math.max(result[0],result[1]);
22
23    }
24
25    private int[] findLargestSum(TreeNode root){
26
27        if(root== null) return new int[]{0,0};
28
29        int[] left = findLargestSum(root.left);
30          
31        int[] right = findLargestSum(root.right);
32
33        int skip = Math.max(left[0],left[1]) + Math.max(right[0],right[1]);
34
35        int rob = root.val + left[0] + right[0];
36
37        return new int[]{skip,rob};
38    }
39}