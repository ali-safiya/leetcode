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
    public List<Integer> postorder(Node root) {
       List<Integer> ans = new ArrayList<Integer>();
        traverse(root,ans);
        if(root!=null)
            ans.add(root.val);
        return ans;
    }
    
    void traverse(Node root, List<Integer> res){
        if(root==null)
            return ;
        List<Node> child = root.children;
        for(int i=0;i<child.size();i++){
            traverse(child.get(i),res);
            res.add(child.get(i).val);
        }
        
    }
}