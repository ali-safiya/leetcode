<h2><a href="https://leetcode.com/problems/iterator-for-combination/">1286. Iterator for Combination</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Design the <code style="user-select: auto;">CombinationIterator</code> class:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">CombinationIterator(string characters, int combinationLength)</code> Initializes the object with a string <code style="user-select: auto;">characters</code> of <strong style="user-select: auto;">sorted distinct</strong> lowercase English letters and a number <code style="user-select: auto;">combinationLength</code> as arguments.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">next()</code> Returns the next combination of length <code style="user-select: auto;">combinationLength</code> in <strong style="user-select: auto;">lexicographical order</strong>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">hasNext()</code> Returns <code style="user-select: auto;">true</code> if and only if there exists a next combination.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input</strong>
["CombinationIterator", "next", "hasNext", "next", "hasNext", "next", "hasNext"]
[["abc", 2], [], [], [], [], [], []]
<strong style="user-select: auto;">Output</strong>
[null, "ab", true, "ac", true, "bc", false]

<strong style="user-select: auto;">Explanation</strong>
CombinationIterator itr = new CombinationIterator("abc", 2);
itr.next();    // return "ab"
itr.hasNext(); // return True
itr.next();    // return "ac"
itr.hasNext(); // return True
itr.next();    // return "bc"
itr.hasNext(); // return False
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= combinationLength &lt;= characters.length &lt;= 15</code></li>
	<li style="user-select: auto;">All the characters of <code style="user-select: auto;">characters</code> are <strong style="user-select: auto;">unique</strong>.</li>
	<li style="user-select: auto;">At most <code style="user-select: auto;">10<sup style="user-select: auto;">4</sup></code> calls will be made to <code style="user-select: auto;">next</code> and <code style="user-select: auto;">hasNext</code>.</li>
	<li style="user-select: auto;">It is guaranteed that all calls of the function <code style="user-select: auto;">next</code> are valid.</li>
</ul>
</div>