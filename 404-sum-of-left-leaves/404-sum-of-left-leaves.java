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
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        
        return find(root,0);
      
    }
    int find(TreeNode root,int i){
        
      if(root==null) 
          return 0;
        if(i==1){
        if(root.left==null && root.right==null )
            sum+=root.val;}
        find(root.left,1);
        find(root.right,0);
        return sum;
    }
}