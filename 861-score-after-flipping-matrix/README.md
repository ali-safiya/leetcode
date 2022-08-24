<h2><a href="https://leetcode.com/problems/score-after-flipping-matrix/">861. Score After Flipping Matrix</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given an <code style="user-select: auto;">m x n</code> binary matrix <code style="user-select: auto;">grid</code>.</p>

<p style="user-select: auto;">A <strong style="user-select: auto;">move</strong> consists of choosing any row or column and toggling each value in that row or column (i.e., changing all <code style="user-select: auto;">0</code>'s to <code style="user-select: auto;">1</code>'s, and all <code style="user-select: auto;">1</code>'s to <code style="user-select: auto;">0</code>'s).</p>

<p style="user-select: auto;">Every row of the matrix is interpreted as a binary number, and the <strong style="user-select: auto;">score</strong> of the matrix is the sum of these numbers.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the highest possible <strong style="user-select: auto;">score</strong> after making any number of <strong style="user-select: auto;">moves</strong> (including zero moves)</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/07/23/lc-toogle1.jpg" style="width: 500px; height: 299px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> grid = [[0,0,1,1],[1,0,1,0],[1,1,0,0]]
<strong style="user-select: auto;">Output:</strong> 39
<strong style="user-select: auto;">Explanation:</strong> 0b1111 + 0b1001 + 0b1111 = 15 + 9 + 15 = 39
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> grid = [[0]]
<strong style="user-select: auto;">Output:</strong> 1
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">m == grid.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">n == grid[i].length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= m, n &lt;= 20</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">grid[i][j]</code> is either <code style="user-select: auto;">0</code> or <code style="user-select: auto;">1</code>.</li>
</ul>
</div>