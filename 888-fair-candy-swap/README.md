<h2><a href="https://leetcode.com/problems/fair-candy-swap/">888. Fair Candy Swap</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Alice and Bob have a different total number of candies. You are given two integer arrays <code style="user-select: auto;">aliceSizes</code> and <code style="user-select: auto;">bobSizes</code> where <code style="user-select: auto;">aliceSizes[i]</code> is the number of candies of the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> box of candy that Alice has and <code style="user-select: auto;">bobSizes[j]</code> is the number of candies of the <code style="user-select: auto;">j<sup style="user-select: auto;">th</sup></code> box of candy that Bob has.</p>

<p style="user-select: auto;">Since they are friends, they would like to exchange one candy box each so that after the exchange, they both have the same total amount of candy. The total amount of candy a person has is the sum of the number of candies in each box they have.</p>

<p style="user-select: auto;">Return a<em style="user-select: auto;">n integer array </em><code style="user-select: auto;">answer</code><em style="user-select: auto;"> where </em><code style="user-select: auto;">answer[0]</code><em style="user-select: auto;"> is the number of candies in the box that Alice must exchange, and </em><code style="user-select: auto;">answer[1]</code><em style="user-select: auto;"> is the number of candies in the box that Bob must exchange</em>. If there are multiple answers, you may <strong style="user-select: auto;">return any</strong> one of them. It is guaranteed that at least one answer exists.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> aliceSizes = [1,1], bobSizes = [2,2]
<strong style="user-select: auto;">Output:</strong> [1,2]
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> aliceSizes = [1,2], bobSizes = [2,3]
<strong style="user-select: auto;">Output:</strong> [1,2]
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> aliceSizes = [2], bobSizes = [1,3]
<strong style="user-select: auto;">Output:</strong> [2,3]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= aliceSizes.length, bobSizes.length &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= aliceSizes[i], bobSizes[j] &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;">Alice and Bob have a different total number of candies.</li>
	<li style="user-select: auto;">There will be at least one valid answer for the given input.</li>
</ul>
</div>