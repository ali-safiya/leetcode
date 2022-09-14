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
    int count=0;
    public int pseudoPalindromicPaths (TreeNode root) {
        
        
        findPaths(root,0);
        return count;
        
    }
    
    void findPaths(TreeNode root , int  path){
        
        if(root!=null){
            path ^= (1 << root.val);
        }
        else
            return;
        if(root.right== null && root.left==null){
            
            if((path &( path-1) )==0)
                count++;
            
        }
        
        findPaths(root.left, path);
        findPaths(root.right,path);
    }
}