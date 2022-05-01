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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans =new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
       
        String dir = "true";
        if(root==null)
            return ans;
        q.add(root);
       
        int level=0;
        while(!q.isEmpty()){
            int size= q.size();
             LinkedList<Integer> list = new LinkedList<>();
            for(int i=0;i<size;i++){
              TreeNode cur = q.remove();

                    if(cur.left!=null)
                        q.add(cur.left);
                    if(cur.right!=null)
                        q.add(cur.right);
        
                if(level%2==0){
                    list.add(cur.val);
                }
                else{
                    list.addFirst(cur.val);
                }
                
            }
            level++;
            ans.add(list);
            }
            
            
        return ans;
    }
    
}