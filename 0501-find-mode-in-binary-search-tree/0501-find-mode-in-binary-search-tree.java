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
    int maxfreq=1;
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        find(root,map);
        
        int[] ans = new int[map.size()];
        int k=0;
        for(Integer item : map.keySet()){
            
            if(map.get(item)==maxfreq){
                ans[k++]=item;
            }
        }
        return Arrays.copyOf(ans,k);
    }
    
    public void find(TreeNode root, HashMap<Integer,Integer> map){
        
        if(root==null){
            return;
        }
        
        if(map.containsKey(root.val)){
            int freq= map.get(root.val);
            map.put(root.val,freq+1);
            maxfreq=Math.max(maxfreq,freq+1);
        }
        else{
            map.put(root.val,1);
        }
        
        find(root.left,map);
        find(root.right,map);
    }
}