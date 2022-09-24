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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        
        
        List<List<Integer>> paths = new ArrayList<List<Integer>>();
        
        if(root==null)
            return paths;
        
        List<Integer> path = new ArrayList<Integer>();
        
        findPaths(root,targetSum,0,paths,path);
        
        return paths;
        
    }
    
    void findPaths(TreeNode root, int targetSum , int sum, List<List<Integer>> paths,List<Integer> path){
         
        path.add(root.val);
        sum+=root.val;
        
        if(root.left==null && root.right==null && sum==targetSum){
            paths.add(new ArrayList<>(path));
        }

       
        
         
        if(root.left!=null){
           
            findPaths(root.left,targetSum,sum,paths,path);
        }
        
        if(root.right!=null){
              findPaths(root.right,targetSum,sum,paths,path);
        }
        
        path.remove(path.size()-1);
        sum-=root.val;
        
    }
}