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
    public TreeNode sortedArrayToBST(int[] nums) {
      return formBST(0,nums.length,nums);  
    }
    TreeNode formBST(int start,int end,int[] nums){
        
        if(start<0 || end>nums.length || start>=end)
            return null;
        
        int mid= (start+end)/2;
        
        TreeNode left= formBST(start,mid,nums);
        TreeNode right=formBST(mid+1,end,nums);
        
        return new TreeNode(nums[mid],left,right);
    }
}