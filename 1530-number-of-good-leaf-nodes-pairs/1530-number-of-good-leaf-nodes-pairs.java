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
    int count;
    public int countPairs(TreeNode root, int distance) {
        count =0;
        
        find(root,distance);
        
        return count;
        
    }
    List<Integer>  find(TreeNode root ,int distance){
        
        if(root==null){
            return new ArrayList<>();
        }
        
        if(root.left==null && root.right == null){
            List<Integer> sublist = new ArrayList<>(1);
            sublist.add(1);
            return sublist;
        }
        
        List<Integer> left = find(root.left,distance);
        List<Integer> right =find(root.right,distance);
        
        
        for(int l : left){
            for(int r :right){
                
                if(l+r <= distance){
                    count++;
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int l :left){
          list.add(l+1);
        }
        for(int r: right){
            list.add(r+1);
        }
        return list;
    }
}