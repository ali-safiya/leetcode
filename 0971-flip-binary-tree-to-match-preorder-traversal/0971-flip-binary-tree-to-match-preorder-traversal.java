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
    int ind=0;
    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        List<Integer> ans = new ArrayList<Integer>();
        
        boolean isPos = dfs(root,voyage,ans);
        
        if(isPos)
            return ans;
        else{
            return Arrays.asList(-1);
        }
        
    }
    boolean dfs(TreeNode root , int[] v , List<Integer> ans){
        
        if(root==null)
            return true;
        
        if(root.val!= v[ind++]){
            return false;
        }
        if(root.left!= null && root.left.val != v[ind]){
            ans.add(root.val);
            return dfs(root.right,v,ans) && dfs(root.left,v,ans);
        }
        else{
            return dfs(root.left,v,ans) && dfs(root.right,v,ans);

        }
    }
}