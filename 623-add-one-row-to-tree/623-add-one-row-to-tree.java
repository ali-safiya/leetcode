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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
         if(root==null)
            return null;
        
        if(depth==2 ){
            TreeNode newNodeleft = new TreeNode(val);
            TreeNode newNoderight = new TreeNode(val);
            
            newNodeleft.left =root.left;
            root.left = newNodeleft;
          
        
            newNoderight.right=root.right;
            root.right = newNoderight;
            
            return root;
        }
        
        if(depth==1){
            TreeNode newNode = new TreeNode(val);
            newNode.left=root;
            return newNode;
        }
        
       
       
        addOneRow(root.left,val,depth-1);
        addOneRow(root.right,val,depth-1);
        
        return root;
            
        
    }
}