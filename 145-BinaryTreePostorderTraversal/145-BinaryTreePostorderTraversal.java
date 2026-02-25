// Last updated: 26/02/2026, 01:19:24
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
17    public List<Integer> postorderTraversal(TreeNode root) {
18        
19        List<Integer> ans = new ArrayList<Integer>();
20        Stack<TreeNode> st = new Stack<TreeNode>();
21        TreeNode cur = root;
22        TreeNode prev =null;
23
24        while(cur!=null || !st.isEmpty()){
25
26            while(cur!=null){
27                st.push(cur);
28                cur=cur.left;
29            }
30
31            cur= st.peek();
32
33            if(cur.right==null || cur.right==prev){
34                ans.add(cur.val);
35                st.pop();
36                prev=cur;
37                cur=null;
38            }
39            else{
40                cur=cur.right;
41            }
42
43        }
44        return ans;
45    }
46}