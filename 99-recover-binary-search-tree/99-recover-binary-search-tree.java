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
     TreeNode  prev,first=null,middle=null,last=null;
    public void recoverTree(TreeNode root) {
        prev= new TreeNode(Integer.MIN_VALUE);
        
        inorder(root);
        if(first !=null && last!=null)
            swap(first,last);
        else
            swap(first,middle);
      
    }
    void swap(TreeNode a ,TreeNode b){
        int temp =a.val;
        a.val=b.val;
        b.val=temp;
    }
    
    void inorder(TreeNode root){
        if(root==null)
            return ;
        inorder(root.left);
        if(prev!=null && prev.val > root.val){
            
            if(first!=null){
                last=root;
            }
            else{
              first=prev;
              middle=root;

            }
        }
        prev= root;
        inorder(root.right);
    }
    
}