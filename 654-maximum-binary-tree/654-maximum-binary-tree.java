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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        
        
      return construct(nums,0,nums.length);
        
        
    }
    
    TreeNode construct(int[] nums , int low , int high){
        
        if(low==high)
            return null;
        
        int maxInd = findMaxIndex(nums,low,high);
        
        TreeNode root = new TreeNode(nums[maxInd]);
        
        root.left = construct(nums,low,maxInd);
        root.right= construct(nums,maxInd+1,high);
        
        return root;
        
    }
    
    int findMaxIndex(int[] nums ,int low ,int high){
        
        int index=low;
        int max=0;
        for(int i=low ;i<high;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }
        return index;
    }
}