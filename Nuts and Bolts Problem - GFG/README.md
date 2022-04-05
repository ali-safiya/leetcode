# Nuts and Bolts Problem
## Medium 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"><a onclick="gtagHelperFunction('clickopen','salesevent_gsc_problemspage_promobanner')" href="https://practice.geeksforgeeks.org/summer-carnival-2022?utm_source=practiceproblems&amp;utm_medium=problemspromobanner&amp;utm_campaign=gsc22" target="_blank" style="user-select: auto;"></a></p><div style="margin: 14px 0px !important; user-select: auto;" class="row"><a onclick="gtagHelperFunction('clickopen','salesevent_gsc_problemspage_promobanner')" href="https://practice.geeksforgeeks.org/summer-carnival-2022?utm_source=practiceproblems&amp;utm_medium=problemspromobanner&amp;utm_campaign=gsc22" target="_blank" style="user-select: auto;">             <div class="col-md-12" style="cursor: pointer; background: 0% 0% no-repeat padding-box padding-box rgb(239, 248, 243); align-items: center; position: relative; padding: 1.5%; border-radius: 10px; display: inline-block; text-align: center; font-weight: 600; color: rgb(51, 51, 51); user-select: auto;"> <img src="https://media.geeksforgeeks.org/img-practice/gcs2022thumbnail-1649059370.png" alt="Lamp" width="46" height="40" style="background: 0% 0% no-repeat padding-box padding-box transparent; opacity: 1; margin: 0px 16px; user-select: auto;" class="img-responsive"> Geeks Summer Carnival is LIVE NOW &nbsp; <i class="fa fa-external-link" aria-hidden="true" style="user-select: auto;"></i> </div></a></div><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a set of <strong style="user-select: auto;">N</strong>&nbsp;nuts of different sizes and <strong style="user-select: auto;">N</strong>&nbsp;bolts of different sizes. There is a one-one mapping between nuts and bolts. Match nuts and bolts efficiently.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Comparison of a nut to another nut or a bolt to another bolt is not allowed. It means nut can only be compared with bolt and bolt can only be compared with nut to see which one is bigger/smaller.<br style="user-select: auto;">
The elements should follow&nbsp;the following order&nbsp;! # $ % &amp; * @ ^ ~ .</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input: 
</strong>N = 5
nuts[] = {@, %, $, #, ^}
bolts[] = {%, @, #, $ ^}
<strong style="user-select: auto;">Output:</strong> 
# $ % @ ^
# $ % @ ^
</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong> 
N = 9
nuts[] = {^, &amp;, %, @, #, *, $, ~, !}
bolts[] = {~, #, @, %, &amp;, *, $ ,^, !}
<strong style="user-select: auto;">Output:</strong> 
! # $ % &amp; * @ ^ ~
! # $ % &amp; * @ ^ ~
</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:&nbsp;&nbsp;</strong><br style="user-select: auto;">
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong style="user-select: auto;">matchPairs()</strong>&nbsp;which takes an array of characters&nbsp;<strong style="user-select: auto;">nuts[]</strong>, <strong style="user-select: auto;">bolts[] </strong>and&nbsp;<strong style="user-select: auto;">n</strong><strong style="user-select: auto;">&nbsp;</strong>as parameters and returns void. You need to change the array itself.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong>&nbsp;O(NlogN)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong>&nbsp;O(1)</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 &lt;= N &lt;= 9<br style="user-select: auto;">
Array of Nuts/Bolts can only consist of the following elements:{'@', '#', '$', '%', '^', '&amp;', '~', '*', '!'}.</span><br style="user-select: auto;">
&nbsp;</p>
 <p style="user-select: auto;"></p>
            </div>