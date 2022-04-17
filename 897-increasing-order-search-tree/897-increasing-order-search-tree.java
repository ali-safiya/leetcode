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
    public TreeNode increasingBST(TreeNode root) {
      
        List<Integer> values = new ArrayList<Integer>();
        inorder(root,values);
        
        TreeNode ans = new TreeNode();
        TreeNode temp=ans;
        for(int v : values){
            ans.right= new TreeNode(v);
            ans=ans.right;
        }
        
        return temp.right;
    }
    
    void inorder(TreeNode root,List<Integer> values){
        
        if(root==null)
            return;
        inorder(root.left,values);
        values.add(root.val);
        inorder(root.right,values);
            
    }
}