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
    public int countNodes(TreeNode root) {
        
        int left = findLeft(root);
        int right= findRight(root);
        
        if(left==right){
            return (int)Math.pow(2,left)-1;
        }
        
        return 1+ countNodes(root.left)+countNodes(root.right);
        
    }
    
    int findLeft(TreeNode root){
        int count=0;
        while(root!=null){
            root=root.left;
            count++;
        }
        return count;
    }
    int findRight(TreeNode root){
        int count=0;
        while(root!=null){
            root=root.right;
            count++;
        }
        return count;
    }
    
    
    
}