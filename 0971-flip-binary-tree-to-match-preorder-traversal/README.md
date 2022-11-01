<h2><a href="https://leetcode.com/problems/flip-binary-tree-to-match-preorder-traversal/">971. Flip Binary Tree To Match Preorder Traversal</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given the <code style="user-select: auto;">root</code> of a binary tree with <code style="user-select: auto;">n</code> nodes, where each node is uniquely assigned a value from <code style="user-select: auto;">1</code> to <code style="user-select: auto;">n</code>. You are also given a sequence of <code style="user-select: auto;">n</code> values <code style="user-select: auto;">voyage</code>, which is the <strong style="user-select: auto;">desired</strong> <a href="https://en.wikipedia.org/wiki/Tree_traversal#Pre-order" target="_blank" style="user-select: auto;"><strong style="user-select: auto;">pre-order traversal</strong></a> of the binary tree.</p>

<p style="user-select: auto;">Any node in the binary tree can be <strong style="user-select: auto;">flipped</strong> by swapping its left and right subtrees. For example, flipping node 1 will have the following effect:</p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/02/15/fliptree.jpg" style="width: 400px; height: 187px; user-select: auto;">
<p style="user-select: auto;">Flip the <strong style="user-select: auto;">smallest</strong> number of nodes so that the <strong style="user-select: auto;">pre-order traversal</strong> of the tree <strong style="user-select: auto;">matches</strong> <code style="user-select: auto;">voyage</code>.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">a list of the values of all <strong style="user-select: auto;">flipped</strong> nodes. You may return the answer in <strong style="user-select: auto;">any order</strong>. If it is <strong style="user-select: auto;">impossible</strong> to flip the nodes in the tree to make the pre-order traversal match </em><code style="user-select: auto;">voyage</code><em style="user-select: auto;">, return the list </em><code style="user-select: auto;">[-1]</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2019/01/02/1219-01.png" style="width: 150px; height: 205px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [1,2], voyage = [2,1]
<strong style="user-select: auto;">Output:</strong> [-1]
<strong style="user-select: auto;">Explanation:</strong> It is impossible to flip the nodes such that the pre-order traversal matches voyage.
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2019/01/02/1219-02.png" style="width: 150px; height: 142px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [1,2,3], voyage = [1,3,2]
<strong style="user-select: auto;">Output:</strong> [1]
<strong style="user-select: auto;">Explanation:</strong> Flipping node 1 swaps nodes 2 and 3, so the pre-order traversal matches voyage.</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 3:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2019/01/02/1219-02.png" style="width: 150px; height: 142px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [1,2,3], voyage = [1,2,3]
<strong style="user-select: auto;">Output:</strong> []
<strong style="user-select: auto;">Explanation:</strong> The tree's pre-order traversal already matches voyage, so no nodes need to be flipped.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The number of nodes in the tree is <code style="user-select: auto;">n</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">n == voyage.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= Node.val, voyage[i] &lt;= n</code></li>
	<li style="user-select: auto;">All the values in the tree are <strong style="user-select: auto;">unique</strong>.</li>
	<li style="user-select: auto;">All the values in <code style="user-select: auto;">voyage</code> are <strong style="user-select: auto;">unique</strong>.</li>
</ul>
</div>