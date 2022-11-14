<h2><a href="https://leetcode.com/problems/swap-adjacent-in-lr-string/">777. Swap Adjacent in LR String</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">In a string composed of <code style="user-select: auto;">'L'</code>, <code style="user-select: auto;">'R'</code>, and <code style="user-select: auto;">'X'</code> characters, like <code style="user-select: auto;">"RXXLRXRXL"</code>, a move consists of either replacing one occurrence of <code style="user-select: auto;">"XL"</code> with <code style="user-select: auto;">"LX"</code>, or replacing one occurrence of <code style="user-select: auto;">"RX"</code> with <code style="user-select: auto;">"XR"</code>. Given the starting string <code style="user-select: auto;">start</code> and the ending string <code style="user-select: auto;">end</code>, return <code style="user-select: auto;">True</code> if and only if there exists a sequence of moves to transform one string to the other.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> start = "RXXLRXRXL", end = "XRLXXRRLX"
<strong style="user-select: auto;">Output:</strong> true
<strong style="user-select: auto;">Explanation:</strong> We can transform start to end following these steps:
RXXLRXRXL -&gt;
XRXLRXRXL -&gt;
XRLXRXRXL -&gt;
XRLXXRRXL -&gt;
XRLXXRRLX
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> start = "X", end = "L"
<strong style="user-select: auto;">Output:</strong> false
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= start.length&nbsp;&lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">start.length == end.length</code></li>
	<li style="user-select: auto;">Both <code style="user-select: auto;">start</code> and <code style="user-select: auto;">end</code> will only consist of characters in <code style="user-select: auto;">'L'</code>, <code style="user-select: auto;">'R'</code>, and&nbsp;<code style="user-select: auto;">'X'</code>.</li>
</ul>
</div>