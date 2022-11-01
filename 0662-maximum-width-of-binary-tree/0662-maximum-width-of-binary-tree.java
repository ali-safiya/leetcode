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
    class pair{
        TreeNode node;
        int pos;
        
        pair(TreeNode node , int pos ){
            this.node = node;
            this.pos=pos;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        
        
        Queue<pair> q = new LinkedList<pair>();
        
        int maxWidth=1;
        
        if(root!=null){
            q.add(new pair(root, 0));
        }
        int start=0;
        int end=0;
        
        while(!q.isEmpty()){
            
            int size = q.size();
            
            for(int i=0;i<size;i++){
                
               pair p = q.poll();
                TreeNode cur =p.node;
                if(i==0){
                    start=p.pos;
                }
                if(cur.left!=null) 
                q.add(new pair(cur.left,2*p.pos +1));
                if(cur.right!=null)
                q.add(new pair(cur.right,2*p.pos+2));
                if(i==size-1){
                    end=p.pos;
                }
            }
            maxWidth=Math.max(maxWidth,end-start+1);
        }
        
        return maxWidth;
        
    }
}