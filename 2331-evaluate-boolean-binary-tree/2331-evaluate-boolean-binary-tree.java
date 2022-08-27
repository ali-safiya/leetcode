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
    public boolean evaluateTree(TreeNode root) {
        
       return postOrder(root);
        
    }
    
     boolean postOrder(TreeNode root){
         if(root.left==null && root.right==null)
             return root.val==0? false : true  ;
         
         boolean left =postOrder(root.left);
         boolean right =postOrder(root.right);
         
         if(root.val == 2)
             return left | right;
         else
             return left & right;
     }
}