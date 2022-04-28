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
    int ans=Integer.MAX_VALUE;
    TreeNode prev;
    public int minDiffInBST(TreeNode root) {
        prev=null;
        postorder(root);
        return ans;
    }
    void postorder(TreeNode root){
     
        if(root == null)
            return ;
        
       postorder(root.left);
       if(prev!=null) 
       ans= Math.min(ans,Math.abs(root.val-prev.val));
       prev=root;
       postorder(root.right);
        
    }
}