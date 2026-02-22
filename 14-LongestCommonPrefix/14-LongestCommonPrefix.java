// Last updated: 23/02/2026, 03:03:04
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        
4        Arrays.sort(strs);
5
6        String first = strs[0];
7        String last = strs[strs.length-1];
8
9        String prefix ="";
10
11        for(int i=0;i<Math.min(first.length(),last.length());i++){
12            if(first.charAt(i) != last.charAt(i)) break;
13
14            prefix+=first.charAt(i);
15        }
16        return prefix;
17    }
18}