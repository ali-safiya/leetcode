<h2><a href="https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/">1005. Maximize Sum Of Array After K Negations</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an integer array <code style="user-select: auto;">nums</code> and an integer <code style="user-select: auto;">k</code>, modify the array in the following way:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">choose an index <code style="user-select: auto;">i</code> and replace <code style="user-select: auto;">nums[i]</code> with <code style="user-select: auto;">-nums[i]</code>.</li>
</ul>

<p style="user-select: auto;">You should apply this process exactly <code style="user-select: auto;">k</code> times. You may choose the same index <code style="user-select: auto;">i</code> multiple times.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the largest possible sum of the array after modifying it in this way</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [4,2,3], k = 1
<strong style="user-select: auto;">Output:</strong> 5
<strong style="user-select: auto;">Explanation:</strong> Choose index 1 and nums becomes [4,-2,3].
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [3,-1,0,2], k = 3
<strong style="user-select: auto;">Output:</strong> 6
<strong style="user-select: auto;">Explanation:</strong> Choose indices (1, 2, 2) and nums becomes [3,1,0,2].
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [2,-3,-1,5,-4], k = 2
<strong style="user-select: auto;">Output:</strong> 13
<strong style="user-select: auto;">Explanation:</strong> Choose indices (1, 4) and nums becomes [2,3,-1,5,4].
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-100 &lt;= nums[i] &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= k &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
</ul>
</div>