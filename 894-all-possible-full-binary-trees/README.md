<h2><a href="https://leetcode.com/problems/all-possible-full-binary-trees/">894. All Possible Full Binary Trees</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an integer <code style="user-select: auto;">n</code>, return <em style="user-select: auto;">a list of all possible <strong style="user-select: auto;">full binary trees</strong> with</em> <code style="user-select: auto;">n</code> <em style="user-select: auto;">nodes</em>. Each node of each tree in the answer must have <code style="user-select: auto;">Node.val == 0</code>.</p>

<p style="user-select: auto;">Each element of the answer is the root node of one possible tree. You may return the final list of trees in <strong style="user-select: auto;">any order</strong>.</p>

<p style="user-select: auto;">A <strong style="user-select: auto;">full binary tree</strong> is a binary tree where each node has exactly <code style="user-select: auto;">0</code> or <code style="user-select: auto;">2</code> children.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/08/22/fivetrees.png" style="width: 700px; height: 400px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 7
<strong style="user-select: auto;">Output:</strong> [[0,0,0,null,null,0,0,null,null,0,0],[0,0,0,null,null,0,0,0,0],[0,0,0,0,0,0,0],[0,0,0,0,0,null,null,null,null,0,0],[0,0,0,0,0,null,null,0,0]]
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 3
<strong style="user-select: auto;">Output:</strong> [[0,0,0]]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 20</code></li>
</ul>
</div>