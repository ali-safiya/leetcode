<h2><a href="https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/">1545. Find Kth Bit in Nth Binary String</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given two positive integers <code style="user-select: auto;">n</code> and <code style="user-select: auto;">k</code>, the binary string <code style="user-select: auto;">S<sub style="user-select: auto;">n</sub></code> is formed as follows:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">S<sub style="user-select: auto;">1</sub> = "0"</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">S<sub style="user-select: auto;">i</sub> = S<sub style="user-select: auto;">i - 1</sub> + "1" + reverse(invert(S<sub style="user-select: auto;">i - 1</sub>))</code> for <code style="user-select: auto;">i &gt; 1</code></li>
</ul>

<p style="user-select: auto;">Where <code style="user-select: auto;">+</code> denotes the concatenation operation, <code style="user-select: auto;">reverse(x)</code> returns the reversed string <code style="user-select: auto;">x</code>, and <code style="user-select: auto;">invert(x)</code> inverts all the bits in <code style="user-select: auto;">x</code> (<code style="user-select: auto;">0</code> changes to <code style="user-select: auto;">1</code> and <code style="user-select: auto;">1</code> changes to <code style="user-select: auto;">0</code>).</p>

<p style="user-select: auto;">For example, the first four strings in the above sequence are:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">S<sub style="user-select: auto;">1 </sub>= "0"</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">S<sub style="user-select: auto;">2 </sub>= "0<strong style="user-select: auto;">1</strong>1"</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">S<sub style="user-select: auto;">3 </sub>= "011<strong style="user-select: auto;">1</strong>001"</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">S<sub style="user-select: auto;">4</sub> = "0111001<strong style="user-select: auto;">1</strong>0110001"</code></li>
</ul>

<p style="user-select: auto;">Return <em style="user-select: auto;">the</em> <code style="user-select: auto;">k<sup style="user-select: auto;">th</sup></code> <em style="user-select: auto;">bit</em> <em style="user-select: auto;">in</em> <code style="user-select: auto;">S<sub style="user-select: auto;">n</sub></code>. It is guaranteed that <code style="user-select: auto;">k</code> is valid for the given <code style="user-select: auto;">n</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 3, k = 1
<strong style="user-select: auto;">Output:</strong> "0"
<strong style="user-select: auto;">Explanation:</strong> S<sub style="user-select: auto;">3</sub> is "<strong style="user-select: auto;"><u style="user-select: auto;">0</u></strong>111001".
The 1<sup style="user-select: auto;">st</sup> bit is "0".
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 4, k = 11
<strong style="user-select: auto;">Output:</strong> "1"
<strong style="user-select: auto;">Explanation:</strong> S<sub style="user-select: auto;">4</sub> is "0111001101<strong style="user-select: auto;"><u style="user-select: auto;">1</u></strong>0001".
The 11<sup style="user-select: auto;">th</sup> bit is "1".
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 20</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= k &lt;= 2<sup style="user-select: auto;">n</sup> - 1</code></li>
</ul>
</div>