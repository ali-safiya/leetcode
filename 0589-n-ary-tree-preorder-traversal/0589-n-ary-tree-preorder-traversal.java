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
    public List<Integer> preorder(Node root) {
        
        List<Integer> preorder = new ArrayList<Integer>();
        if(root == null)
            return preorder;
        preorder.add(root.val);
        traverse(root,preorder);
        return preorder;
    }
    
    void traverse(Node node , List<Integer> preorder){
        
        if(node == null)
            return;
        
        List<Node> child = node.children;
        
        for(int i=0;i<child.size();i++){
            preorder.add(child.get(i).val);
            traverse(child.get(i),preorder);
        }
    }
}