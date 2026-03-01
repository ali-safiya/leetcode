// Last updated: 02/03/2026, 01:46:55
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
17    int count=0;
18    public int kthSmallest(TreeNode root, int k) {
19        return find(root,k);   
20    }
21
22    private int  find(TreeNode root, int k){
23        if(root == null) return -1;
24
25        int left = find(root.left,k);
26        count++;
27        if(count == k) return root.val;
28        int right = find(root.right,k);
29
30        if(left!=-1) return left;
31        if(right!=-1) return right;
32
33        return -1 ;
34    }
35}