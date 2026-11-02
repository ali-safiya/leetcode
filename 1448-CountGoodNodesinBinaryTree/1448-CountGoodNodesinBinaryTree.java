// Last updated: 02/11/2026, 10:56:06
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
17    public int goodNodes(TreeNode root) {
18        
19        return findCount(root,Integer.MIN_VALUE);
20    }
21
22    private int findCount(TreeNode root, int max){
23
24        int count =0;
25
26        if(root == null) return 0;
27
28        if(root.val >= max){
29            max = root.val;
30            count =1;
31        }
32
33        count +=  findCount(root.left,max);
34        count += findCount(root.right,max);
35
36        return count;
37
38    }
39}