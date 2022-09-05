/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
        Queue<Node> q = new LinkedList<>();
        
        if(root!=null){
            q.add(root);
        }
        List<List<Integer>> res = new ArrayList<>();
        
        while(!q.isEmpty()){
      
             List<Integer> list = new ArrayList<Integer>();
            int size=q.size();
            for(int j=0;j<size;j++){
                
                Node cur = q.poll();
                List<Node> curChild = new ArrayList<Node>(cur.children);
                
                list.add(cur.val);
            
                for(int i=0;i<curChild.size();i++){
                
                    q.add(curChild.get(i)); 
                }
                

            }
            res.add(list);
        }
        
        return res;
        
    }
    
    
    
    
    
}