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
    class Tuple{
    TreeNode node;
    int row;
    int col;
     public Tuple(TreeNode node,int row,int col){
        this.node=node;
        this.row=row;
        this.col=col;
    }
}

class Solution {

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        
        List<List<Integer>> res = new ArrayList<>();
        
        Queue<Tuple> q = new LinkedList<Tuple>();
        
        TreeMap<Integer , TreeMap<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();
        if(root!=null)
            q.offer(new Tuple(root,0,0));
                   

        while(!q.isEmpty()){
            
            Tuple tuple = q.poll();
            TreeNode nod =tuple.node;
            int row = tuple.row;
            int col= tuple.col;
            if(!map.containsKey(row))
                map.put(row,new TreeMap<>());
            if(!map.get(row).containsKey(col))
                map.get(row).put(col,new PriorityQueue<>());
            
            map.get(row).get(col).offer(nod.val);
            
            if(nod.left!=null)
                q.offer(new Tuple(nod.left,row-1,col+1));
            if(nod.right!=null)
                q.offer(new Tuple(nod.right,row+1,col+1));
            
        }
        
        for(TreeMap<Integer,PriorityQueue<Integer>> r : map.values()){
            
           res.add(new ArrayList<>());
            
            for(PriorityQueue<Integer> c: r.values()){
                while(!c.isEmpty())
                res.get(res.size()-1).add(c.poll());
            }
        }
      
       return res;
        
    }
}