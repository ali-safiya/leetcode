// Last updated: 28/02/2026, 01:59:15
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
17    public TreeNode buildTree(int[] preorder, int[] inorder) {
18        HashMap<Integer,Integer> map = new HashMap<>();
19
20        for(int i= 0;i<inorder.length;i++){
21            map.put(inorder[i],i);
22        }
23
24        return build(preorder, 0, preorder.length-1,inorder,0,inorder.length-1,map);
25    }
26
27    private TreeNode build(int[] preorder, int preStr, int preEnd , int[] inorder, int inStr, int inEnd, HashMap<Integer, Integer> indexes){
28
29        if(preStr > preEnd || inStr > inEnd) return null;
30
31        int rootVal = preorder[preStr];
32        TreeNode root = new TreeNode(rootVal);
33
34        int rootIndex = indexes.get(rootVal);
35        int leftSubTreeSize = rootIndex -inStr;
36
37        root.left = build(preorder, preStr+1,preStr+ leftSubTreeSize,inorder ,inStr, rootIndex-1 , indexes );
38
39        root.right = build(preorder, preStr +leftSubTreeSize +1, preEnd, inorder , rootIndex+1 , inEnd, indexes );
40
41        return root;
42    }
43}