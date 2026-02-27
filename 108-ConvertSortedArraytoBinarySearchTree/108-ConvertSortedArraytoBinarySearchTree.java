// Last updated: 28/02/2026, 03:43:18
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
17    public TreeNode sortedArrayToBST(int[] nums) {
18        
19        return construct(0,nums.length-1,nums);
20    }
21
22    private TreeNode construct(int low, int high , int[] nums){
23
24        if(low>high) return null;
25
26        int mid = low + (high-low)/2;
27
28        TreeNode root = new TreeNode(nums[mid]);
29
30        root.left = construct(low,mid-1,nums);
31        root.right = construct(mid+1,high,nums);
32
33        return root;
34    }
35}