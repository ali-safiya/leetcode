// Last updated: 01/03/2026, 01:32:16
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10
11class Solution {
12    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
13
14        if(root == null) return null;
15
16        TreeNode left = null;
17        TreeNode right = null;
18
19        if(root.val == p.val || root.val == q.val){
20            return root;
21        }
22        if(root.val > p.val && root.val > q.val){
23            left = lowestCommonAncestor(root.left,p,q);
24        }
25        else if(root.val <p.val && root.val < q.val){
26            right = lowestCommonAncestor(root.right,p,q);
27        }
28        else{
29            left= lowestCommonAncestor(root.left,p,q);
30            right= lowestCommonAncestor(root.right,p,q);
31        }
32
33        if(left != null && right != null) return root;
34
35        return left==null ? right : left ;
36        
37    }
38}