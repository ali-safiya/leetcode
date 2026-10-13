// Last updated: 14/10/2026, 04:26:43
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3
4        HashSet<Character> set = new HashSet<>();
5
6        int left =0;
7        int maxLen =0;
8        int[] lastSeen = new int[128];
9
10        for(int i=0;i<s.length();i++){
11
12            char cur = s.charAt(i);
13
14            if(set.contains(cur)){
15                left = Math.max(left, lastSeen[cur]+1);
16            }
17            lastSeen[cur] = i;
18            set.add(cur);
19            maxLen = Math.max(maxLen, i-left+1);
20        }
21        return maxLen;
22    }
23}