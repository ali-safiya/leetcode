<h2><a href="https://leetcode.com/problems/find-resultant-array-after-removing-anagrams/">2273. Find Resultant Array After Removing Anagrams</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a <strong style="user-select: auto;">0-indexed</strong> string array <code style="user-select: auto;">words</code>, where <code style="user-select: auto;">words[i]</code> consists of lowercase English letters.</p>

<p style="user-select: auto;">In one operation, select any index <code style="user-select: auto;">i</code> such that <code style="user-select: auto;">0 &lt; i &lt; words.length</code> and <code style="user-select: auto;">words[i - 1]</code> and <code style="user-select: auto;">words[i]</code> are <strong style="user-select: auto;">anagrams</strong>, and <strong style="user-select: auto;">delete</strong> <code style="user-select: auto;">words[i]</code> from <code style="user-select: auto;">words</code>. Keep performing this operation as long as you can select an index that satisfies the conditions.</p>

<p style="user-select: auto;">Return <code style="user-select: auto;">words</code> <em style="user-select: auto;">after performing all operations</em>. It can be shown that selecting the indices for each operation in <strong style="user-select: auto;">any</strong> arbitrary order will lead to the same result.</p>

<p style="user-select: auto;">An <strong style="user-select: auto;">Anagram</strong> is a word or phrase formed by rearranging the letters of a different word or phrase using all the original letters exactly once. For example, <code style="user-select: auto;">"dacb"</code> is an anagram of <code style="user-select: auto;">"abdc"</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> words = ["abba","baba","bbaa","cd","cd"]
<strong style="user-select: auto;">Output:</strong> ["abba","cd"]
<strong style="user-select: auto;">Explanation:</strong>
One of the ways we can obtain the resultant array is by using the following operations:
- Since words[2] = "bbaa" and words[1] = "baba" are anagrams, we choose index 2 and delete words[2].
  Now words = ["abba","baba","cd","cd"].
- Since words[1] = "baba" and words[0] = "abba" are anagrams, we choose index 1 and delete words[1].
  Now words = ["abba","cd","cd"].
- Since words[2] = "cd" and words[1] = "cd" are anagrams, we choose index 2 and delete words[2].
  Now words = ["abba","cd"].
We can no longer perform any operations, so ["abba","cd"] is the final answer.</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> words = ["a","b","c","d","e"]
<strong style="user-select: auto;">Output:</strong> ["a","b","c","d","e"]
<strong style="user-select: auto;">Explanation:</strong>
No two adjacent strings in words are anagrams of each other, so no operations are performed.</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= words.length &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= words[i].length &lt;= 10</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">words[i]</code> consists of lowercase English letters.</li>
</ul>
</div>