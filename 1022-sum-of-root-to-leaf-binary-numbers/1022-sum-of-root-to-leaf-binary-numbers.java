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
    int ans=0;
    public int sumRootToLeaf(TreeNode root) {

        preorder(root,0);
        return ans;
        
    }
    void preorder(TreeNode root,int num){
        if(root!=null){
         num= num<<1 |root.val;
        
        if(root.left==null && root.right==null)
        {
           
           ans+=num;
            return;
        }
        
        preorder(root.left,num);
        preorder(root.right,num);
        }
    }
}