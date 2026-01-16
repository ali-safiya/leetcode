// Last updated: 17/01/2026, 00:57:08
1class Solution {
2    public int longestConsecutive(int[] nums) {
3
4        int n = nums.length;
5
6        int longest = 0;
7
8        HashSet<Integer> st = new HashSet<>();
9
10        for(int num : nums) st.add(num);
11
12        for(int num : st) {
13     
14            if(!st.contains(num-1)){
15                int count =0;
16
17                while(st.contains(num++)){
18                    count++;
19                }
20
21                longest = Math.max(longest,count);
22            }
23        }
24        return longest;
25    }
26}