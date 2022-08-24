<h2><a href="https://leetcode.com/problems/count-number-of-maximum-bitwise-or-subsets/">2044. Count Number of Maximum Bitwise-OR Subsets</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an integer array <code style="user-select: auto;">nums</code>, find the <strong style="user-select: auto;">maximum</strong> possible <strong style="user-select: auto;">bitwise OR</strong> of a subset of <code style="user-select: auto;">nums</code> and return <em style="user-select: auto;">the <strong style="user-select: auto;">number of different non-empty subsets</strong> with the maximum bitwise OR</em>.</p>

<p style="user-select: auto;">An array <code style="user-select: auto;">a</code> is a <strong style="user-select: auto;">subset</strong> of an array <code style="user-select: auto;">b</code> if <code style="user-select: auto;">a</code> can be obtained from <code style="user-select: auto;">b</code> by deleting some (possibly zero) elements of <code style="user-select: auto;">b</code>. Two subsets are considered <strong style="user-select: auto;">different</strong> if the indices of the elements chosen are different.</p>

<p style="user-select: auto;">The bitwise OR of an array <code style="user-select: auto;">a</code> is equal to <code style="user-select: auto;">a[0] <strong style="user-select: auto;">OR</strong> a[1] <strong style="user-select: auto;">OR</strong> ... <strong style="user-select: auto;">OR</strong> a[a.length - 1]</code> (<strong style="user-select: auto;">0-indexed</strong>).</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [3,1]
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong> The maximum possible bitwise OR of a subset is 3. There are 2 subsets with a bitwise OR of 3:
- [3]
- [3,1]
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [2,2,2]
<strong style="user-select: auto;">Output:</strong> 7
<strong style="user-select: auto;">Explanation:</strong> All non-empty subsets of [2,2,2] have a bitwise OR of 2. There are 2<sup style="user-select: auto;">3</sup> - 1 = 7 total subsets.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [3,2,1,5]
<strong style="user-select: auto;">Output:</strong> 6
<strong style="user-select: auto;">Explanation:</strong> The maximum possible bitwise OR of a subset is 7. There are 6 subsets with a bitwise OR of 7:
- [3,5]
- [3,1,5]
- [3,2,5]
- [3,2,1,5]
- [2,5]
- [2,1,5]</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length &lt;= 16</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums[i] &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
</ul>
</div>