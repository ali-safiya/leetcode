<h2><a href="https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/">762. Prime Number of Set Bits in Binary Representation</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given two integers <code style="user-select: auto;">left</code> and <code style="user-select: auto;">right</code>, return <em style="user-select: auto;">the <strong style="user-select: auto;">count</strong> of numbers in the <strong style="user-select: auto;">inclusive</strong> range </em><code style="user-select: auto;">[left, right]</code><em style="user-select: auto;"> having a <strong style="user-select: auto;">prime number of set bits</strong> in their binary representation</em>.</p>

<p style="user-select: auto;">Recall that the <strong style="user-select: auto;">number of set bits</strong> an integer has is the number of <code style="user-select: auto;">1</code>'s present when written in binary.</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">For example, <code style="user-select: auto;">21</code> written in binary is <code style="user-select: auto;">10101</code>, which has <code style="user-select: auto;">3</code> set bits.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> left = 6, right = 10
<strong style="user-select: auto;">Output:</strong> 4
<strong style="user-select: auto;">Explanation:</strong>
6  -&gt; 110 (2 set bits, 2 is prime)
7  -&gt; 111 (3 set bits, 3 is prime)
8  -&gt; 1000 (1 set bit, 1 is not prime)
9  -&gt; 1001 (2 set bits, 2 is prime)
10 -&gt; 1010 (2 set bits, 2 is prime)
4 numbers have a prime number of set bits.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> left = 10, right = 15
<strong style="user-select: auto;">Output:</strong> 5
<strong style="user-select: auto;">Explanation:</strong>
10 -&gt; 1010 (2 set bits, 2 is prime)
11 -&gt; 1011 (3 set bits, 3 is prime)
12 -&gt; 1100 (2 set bits, 2 is prime)
13 -&gt; 1101 (3 set bits, 3 is prime)
14 -&gt; 1110 (3 set bits, 3 is prime)
15 -&gt; 1111 (4 set bits, 4 is not prime)
5 numbers have a prime number of set bits.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= left &lt;= right &lt;= 10<sup style="user-select: auto;">6</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= right - left &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
</ul>
</div>