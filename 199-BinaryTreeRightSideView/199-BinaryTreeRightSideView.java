// Last updated: 27/02/2026, 02:38:01
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
17    public List<Integer> rightSideView(TreeNode root) {
18
19        Queue<TreeNode> q = new ArrayDeque<>();
20        List<Integer> ans = new ArrayList<>();
21
22        if(root == null) return ans;
23        q.add(root);
24
25        while(!q.isEmpty()){
26
27            int size = q.size();
28        
29            for(int i=0;i<size;i++){
30
31                TreeNode cur = q.poll();
32
33                if(cur.left!= null) q.add(cur.left);
34                if(cur.right!=null) q.add(cur.right);
35
36                if(i==size-1){
37                    ans.add(cur.val);
38                }
39            }
40
41        }
42        return ans;
43        
44    }
45}