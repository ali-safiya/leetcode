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
    public List<TreeNode> allPossibleFBT(int n) {
        
    
        return findNodes(n);
        
    }
    
    List<TreeNode>  findNodes(int n){
        
        if(n==1){
               List<TreeNode> ans = new ArrayList<TreeNode>();
               ans.add(new TreeNode(0));
                return ans;
        }
      List<TreeNode> ans = new ArrayList<TreeNode>();  
        for(int i=1;i<n;i+=2){
            
            List<TreeNode> left = findNodes(i);
            List<TreeNode> right = findNodes(n-1-i);
            
            for(TreeNode l: left){
                for (TreeNode r:  right){
                    
                    TreeNode root = new TreeNode(0);
                    root.left = l;
                    root.right= r;
                    
                   ans.add(root);
                }
            }   
        }
        return ans;
    }
}