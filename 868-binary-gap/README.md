<h2><a href="https://leetcode.com/problems/binary-gap/">868. Binary Gap</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given a positive integer <code style="user-select: auto;">n</code>, find and return <em style="user-select: auto;">the <strong style="user-select: auto;">longest distance</strong> between any two <strong style="user-select: auto;">adjacent</strong> </em><code style="user-select: auto;">1</code><em style="user-select: auto;">'s in the binary representation of </em><code style="user-select: auto;">n</code><em style="user-select: auto;">. If there are no two adjacent </em><code style="user-select: auto;">1</code><em style="user-select: auto;">'s, return </em><code style="user-select: auto;">0</code><em style="user-select: auto;">.</em></p>

<p style="user-select: auto;">Two <code style="user-select: auto;">1</code>'s are <strong style="user-select: auto;">adjacent</strong> if there are only <code style="user-select: auto;">0</code>'s separating them (possibly no <code style="user-select: auto;">0</code>'s). The <b style="user-select: auto;">distance</b> between two <code style="user-select: auto;">1</code>'s is the absolute difference between their bit positions. For example, the two <code style="user-select: auto;">1</code>'s in <code style="user-select: auto;">"1001"</code> have a distance of 3.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 22
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong> 22 in binary is "10110".
The first adjacent pair of 1's is "<u style="user-select: auto;">1</u>0<u style="user-select: auto;">1</u>10" with a distance of 2.
The second adjacent pair of 1's is "10<u style="user-select: auto;">11</u>0" with a distance of 1.
The answer is the largest of these two distances, which is 2.
Note that "<u style="user-select: auto;">1</u>01<u style="user-select: auto;">1</u>0" is not a valid pair since there is a 1 separating the two 1's underlined.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 8
<strong style="user-select: auto;">Output:</strong> 0
<strong style="user-select: auto;">Explanation:</strong> 8 in binary is "1000".
There are not any adjacent pairs of 1's in the binary representation of 8, so we return 0.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 5
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong> 5 in binary is "101".
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 10<sup style="user-select: auto;">9</sup></code></li>
</ul>
</div>