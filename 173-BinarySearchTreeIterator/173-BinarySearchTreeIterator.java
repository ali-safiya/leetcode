// Last updated: 02/03/2026, 03:53:21
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class BSTIterator {
17
18    Stack<TreeNode> st ;
19    public BSTIterator(TreeNode root) {
20
21        st = new Stack<>();
22        pushLeft(root);
23        
24    }
25    
26    public int next() {
27        TreeNode cur = st.pop();
28        pushLeft(cur.right);
29        return cur.val;
30    }
31    
32    public boolean hasNext() {
33        return !st.isEmpty();
34    }
35    private void pushLeft(TreeNode node){
36
37        while(node!=null){
38            st.push(node);
39            node= node.left;
40        }
41    }
42}
43
44/**
45 * Your BSTIterator object will be instantiated and called as such:
46 * BSTIterator obj = new BSTIterator(root);
47 * int param_1 = obj.next();
48 * boolean param_2 = obj.hasNext();
49 */