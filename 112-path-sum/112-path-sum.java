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
    public boolean hasPathSum(TreeNode root, int targetSum) {
      
        return find(root,targetSum,0);
  
    }
    boolean find(TreeNode root,int target,int cur_sum){
        if(root==null)
            return false;
        
        
         cur_sum+=root.val;
        if(root.left==null && root.right==null)
            return target==cur_sum;
        
        return find(root.left ,target,cur_sum) || find(root.right ,target,cur_sum) ;  
        
    }
}