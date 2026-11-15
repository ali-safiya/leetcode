// Last updated: 15/11/2026, 18:39:55
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
17    public TreeNode deleteNode(TreeNode root, int key) {
18
19        if(root == null) return null;
20
21        if(root.val > key){
22            root.left = deleteNode(root.left,key);
23        }
24        else if(root.val < key){
25            root.right = deleteNode(root.right,key);
26        }
27        else{
28
29            if(root.left== null) return root.right;
30
31            if(root.right == null) return root.left;
32
33            TreeNode cur = root.right;
34
35            while(cur.left!=null){
36                cur = cur.left;
37            }
38
39            root.val = cur.val;
40
41            root.right = deleteNode(root.right,cur.val);
42            
43        }
44
45        return root;
46        
47    }
48}