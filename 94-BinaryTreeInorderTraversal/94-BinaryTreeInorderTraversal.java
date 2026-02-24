// Last updated: 25/02/2026, 03:47:58
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
17    public List<Integer> inorderTraversal(TreeNode root) {
18
19        List<Integer> ans = new ArrayList<>();
20        Stack<TreeNode> st = new Stack<>();
21
22        TreeNode cur = root;
23
24        while(cur!=null || !st.isEmpty()){
25
26            while(cur!=null){
27                st.push(cur);
28                cur=cur.left;
29            }
30
31            cur = st.pop();
32            ans.add(cur.val);
33
34            cur= cur.right;
35        }
36        return ans;
37    }
38}