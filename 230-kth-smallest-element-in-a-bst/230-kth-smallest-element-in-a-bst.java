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
    public int kthSmallest(TreeNode root, int k) {
    
        if(root==null)
            return -1;
        
        int res= kthSmallest(root.left,k);
        if(res>=0)
            return res;
        count++;
        if(k==count)
            return root.val;
        res=kthSmallest(root.right,k);
        if(res>=0)
            return res;
        
        return -1;

        
    }
}