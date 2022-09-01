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
    public int goodNodes(TreeNode root) {
        int max= root.val;
        
        return findGoodNodes(root,max);
        
    }
    
    int findGoodNodes(TreeNode root,int max){
        
        if(root==null)
            return 0;
        
           int x=0;
        if(root.val>=max){
            x=1;
            max=root.val;
        }
        
        int left = findGoodNodes(root.left,max);
      
        
        int right = findGoodNodes(root.right,max);
       
        return x+left+right;
        
    }
}