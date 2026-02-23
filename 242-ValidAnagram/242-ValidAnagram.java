// Last updated: 24/02/2026, 01:40:02
1class Solution {
2    public boolean isAnagram(String s, String t) {
3
4        if(s.length()!=t.length()) return false;
5
6        int[] letters = new int[26];
7
8        for(int i=0;i<s.length();i++){
9            letters[s.charAt(i)-'a']++;
10        }
11
12        for(int i=0;i<t.length();i++){
13            char cur = t.charAt(i);
14            if(letters[cur-'a'] <= 0) return false;
15
16            letters[cur-'a']--;
17        }
18        return true;
19    }
20}