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
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> ans = new ArrayList<String>();
        
        findpaths(root,ans,"");
        
        return ans;
        
    }
    
    void findpaths(TreeNode root ,List<String> ans , String str){
        
        if(root==null)
        {
            return ;
        }
        
        str+=root.val;
        
        if(root.left==null && root.right==null)
             ans.add(str);
        else{
            str+="->";
        
        findpaths(root.left,ans,str);
        findpaths(root.right,ans,str);
        }
    }
}