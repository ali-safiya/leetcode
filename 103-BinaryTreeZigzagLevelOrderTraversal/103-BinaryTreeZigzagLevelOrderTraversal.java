// Last updated: 27/02/2026, 03:18:40
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
17    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
18
19        List<List<Integer>> ans = new ArrayList<>();
20        Queue<TreeNode> q = new LinkedList<>();
21
22        if(root == null ) return new ArrayList<>();
23
24        q.add(root);
25        boolean leftToRight = true;
26
27        while(!q.isEmpty()){
28
29            int size = q.size();
30            Integer[] level = new Integer[size];
31
32            for(int i=0;i<size;i++){
33
34                TreeNode cur = q.poll();
35
36                if(cur.left!=null){
37                   q.add(cur.left);
38                }
39
40                if(cur.right!=null){
41                    q.add(cur.right);
42                }
43                int index = leftToRight ? i : size-i-1;
44
45                level[index] = cur.val;
46            }
47
48            leftToRight = !leftToRight;
49            ans.add(Arrays.asList(level));
50        }
51        return ans;
52        
53    }
54}