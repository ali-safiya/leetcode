# Assign Mice Holes
## Easy 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given, <strong style="user-select: auto;">N</strong> Mice and N holes are placed in a straight line. Each hole can accommodate only 1 mouse. A mouse can stay at his position, move one step right from <strong style="user-select: auto;">x to x + 1</strong>, or move one step left from <strong style="user-select: auto;">x to x -1</strong>. Any of these moves consumes <strong style="user-select: auto;">1</strong> minute. Write a program to assign mice to holes so that the time when the last mouse gets inside a hole is minimized.</span><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Note: </strong>Arrays M and H are the positions of the N mice and holes.</span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong></span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">N = </strong>3
<strong style="user-select: auto;">M = </strong>{4, -4, 2}
<strong style="user-select: auto;">H = </strong>{4, 0, 5</span><span style="font-size: 18px; user-select: auto;">}</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Output:</strong></span>
<span style="font-size: 18px; user-select: auto;">4</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Explanation:</strong></span>
<span style="font-size: 18px; user-select: auto;">If we assign mouse at 1st index to
the hole at 1st, mouse at 2nd index
to the hole at 2nd and the third to
the hole at third. Then, the maximum
time taken will be by the 2nd mouse,
i.e. 4-0 = 4 minutes.</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong></span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">N = </strong>2
<strong style="user-select: auto;">M = </strong>{4, 2}
<strong style="user-select: auto;">H = </strong>{1, 7</span><span style="font-size: 18px; user-select: auto;">}</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Output:</strong></span>
<span style="font-size: 18px; user-select: auto;">3</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Explanation:</strong></span>
<span style="font-size: 18px; user-select: auto;">If we assign mouse at 1st index to
the hole at 2nd, and mouse at 2nd index
to the hole at 1st, the maximum
time taken will be by the 2nd mouse,
i.e. 7-4 = 3 minutes.</span></pre>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You don't need to read input or print anything. Your task is to complete the function <strong style="user-select: auto;">assignMiceHoles()</strong> which takes an Integer N&nbsp; and arrays M and H as input and returns the answer.</span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(N*log(N))<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong> O(1)</span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></span><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;">1 &lt;= N &lt;= 10<sup style="user-select: auto;">5</sup></span><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;">-10<sup style="user-select: auto;">5 </sup>&lt;= M[i] , H[i] &lt;= 10<sup style="user-select: auto;">5</sup></span></p>
 <p style="user-select: auto;"></p>
            </div>