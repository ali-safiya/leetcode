// Last updated: 26/02/2026, 02:37:20
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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        Queue<TreeNode> q = new ArrayDeque<>();
19        List<List<Integer>> traversal = new ArrayList<>();
20        if(root == null) return new ArrayList<>();
21        q.add(root);
22
23        while(!q.isEmpty()){
24
25            List<Integer> temp = new ArrayList<>();
26            int k = q.size();
27            for(int i=0;i<k;i++){
28                TreeNode cur = q.poll();
29                if(cur.left!=null) q.add(cur.left);
30                if(cur.right!=null) q.add(cur.right);
31                temp.add(cur.val);
32                System.out.println(cur.val);
33            }
34            traversal.add(new ArrayList<>(temp));
35        }
36        return traversal;
37    }
38}