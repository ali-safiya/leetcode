// Last updated: 15/11/2026, 19:33:51
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
17    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
18
19        List<List<Integer>> paths = new ArrayList<>();
20
21        List<Integer> temp = new ArrayList<>();
22
23        findPaths(root,targetSum,paths,temp,0);
24
25        return paths;
26        
27    }
28
29    private void findPaths(TreeNode root, int target,List<List<Integer>> paths, List<Integer> temp, int curSum){
30
31        if(root == null) return;
32
33        // if(curSum > target){
34        //     return;
35        // }
36
37        curSum += root.val;
38        temp.add(root.val);
39
40        if(root.left == null && root.right == null && curSum == target){
41            paths.add(new ArrayList<>(temp));
42        }
43
44        findPaths(root.left,target,paths,temp,curSum);
45        findPaths(root.right,target,paths,temp,curSum);
46
47        temp.remove(temp.size()-1);
48        curSum -= root.val;
49    }
50}