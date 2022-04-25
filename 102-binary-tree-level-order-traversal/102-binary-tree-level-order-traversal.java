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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        if(root!=null)
            q.add(root);
        else return ans;
        q.add(null);
        List<Integer> list= new ArrayList<>();
        
        while(q.size()>0){
            
            TreeNode cur =q.remove();
            
            if(cur==null){
                if(q.size()>0)
                    q.add(null);
                ans.add(list);
                list= new ArrayList<>();;               
            }
            else{
           
         
            list.add(cur.val);
            System.out.println(list);
            System.out.println(ans);
            if(cur.left!=null)
                q.add(cur.left);
            
            if(cur.right!=null)
                q.add(cur.right);
            }
           
               
        }
        return ans;
    }
}