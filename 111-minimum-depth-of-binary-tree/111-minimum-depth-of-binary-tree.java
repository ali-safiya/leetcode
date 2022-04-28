/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  
    public int minDepth(TreeNode root) {
        return find(root);
    }
    int find(TreeNode root){
        if(root==null)
            return 0;
       if(root.left==null && root.right==null)
           return 1;
        
        if(root.left==null)
        return 1+ find(root.right);
        if(root.right==null)
        return 1+ find(root.left);
        return 1+Math.min(find(root.left),find(root.right));
    }
}