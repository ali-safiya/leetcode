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
    public List<Double> averageOfLevels(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        List<Double> avg = new ArrayList<Double>();
        
        if(root!=null)
            q.add(root);
        
        while(!q.isEmpty()){
            
          int size = q.size();
            double sum=0;
            
            for(int i =0;i<size;i++){
                
                TreeNode cur = q.remove();
                sum+=cur.val;
                
                if(cur.left!=null)
                    q.add(cur.left);
                if(cur.right!=null)
                    q.add(cur.right);
                
    
            }
            
            avg.add(sum/size);
        }
        return avg;
    }
}