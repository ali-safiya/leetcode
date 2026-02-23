// Last updated: 24/02/2026, 02:05:46
1class Solution {
2    public int repeatedStringMatch(String a, String b) {
3        
4        StringBuilder s = new StringBuilder();
5        int count =0;
6        while(s.length()<b.length()){
7            s.append(a);
8            count++;
9        }
10
11        if(s.indexOf(b) >= 0) return count;
12
13        s.append(a);
14
15        if(s.indexOf(b) >=0 ) return count+1;
16        return -1;
17    }
18}