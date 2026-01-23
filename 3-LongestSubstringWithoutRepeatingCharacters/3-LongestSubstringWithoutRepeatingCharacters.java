// Last updated: 23/01/2026, 17:36:02
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3
4        HashMap<Character, Integer> map = new HashMap<>();
5        int maxLen =0;
6        int left =0;
7
8        for(int i =0;i<s.length();i++){
9            char cur = s.charAt(i);
10            if(map.containsKey(cur)){
11                left = Math.max(map.get(cur)+1,left);       
12            }
13            map.put(cur,i);
14            maxLen = Math.max(maxLen , i-left+1);
15        }
16       return maxLen; 
17    }
18}