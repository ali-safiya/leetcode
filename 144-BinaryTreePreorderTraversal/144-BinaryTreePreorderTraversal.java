// Last updated: 25/02/2026, 03:29:25
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
16class Solution {
17    public List<Integer> preorderTraversal(TreeNode root) {
18
19        Stack<TreeNode> st = new Stack<>();
20        List<Integer> ans = new ArrayList<>();
21
22        if(root==null) return ans;
23
24        st.push(root);
25
26        while(!st.isEmpty()){
27            TreeNode cur = st.pop();
28            ans.add(cur.val);
29
30            if(cur.right!=null){
31                st.push(cur.right);
32            }
33            if(cur.left!=null){
34                st.push(cur.left);
35            }
36        }
37        return ans;
38    }
39}