// Last updated: 28/02/2026, 02:33:48
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
17    public TreeNode buildTree(int[] inorder, int[] postorder) {
18       HashMap<Integer,Integer> map = new HashMap<>();
19
20        for(int i= 0;i<inorder.length;i++){
21            map.put(inorder[i],i);
22        }
23
24        return build(postorder, 0, postorder.length-1,inorder,0,inorder.length-1,map);  
25    }
26    private TreeNode build(int[] postorder, int postStr, int postEnd , int[] inorder, int inStr, int inEnd, HashMap<Integer, Integer> indexes){
27
28        if(postStr > postEnd || inStr > inEnd) return null;
29
30        int rootVal = postorder[postEnd];
31        TreeNode root = new TreeNode(rootVal);
32
33        int rootIndex = indexes.get(rootVal);
34        int rightSubTreeSize = inEnd- rootIndex;
35
36        root.left = build(postorder, postStr, + postEnd-rightSubTreeSize -1,inorder ,inStr, rootIndex-1 , indexes);
37
38        root.right = build(postorder,postEnd-rightSubTreeSize, postEnd-1, inorder , rootIndex+1 , inEnd, indexes);
39
40        return root;
41    }
42}