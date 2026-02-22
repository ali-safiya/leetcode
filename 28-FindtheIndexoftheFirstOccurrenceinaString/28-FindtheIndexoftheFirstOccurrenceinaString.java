// Last updated: 23/02/2026, 04:44:29
1class Solution {
2    public int strStr(String haystack, String needle) {
3
4        if (needle.length() == 0) return 0;
5
6        int[] lps = buildLPS(needle);
7
8        int i=0;
9        int j=0;
10
11        while(i<haystack.length()){
12
13            if(haystack.charAt(i) == needle.charAt(j)){
14                i++;
15                j++;
16                if(j==needle.length()){
17                    return i-j;
18            }
19            }
20            else{
21                if(j!=0)
22                    j=lps[j-1];
23                else 
24                    i++;
25            }
26        }
27        return -1;
28    }
29
30    private int[] buildLPS(String s){
31
32        int[] lps= new int[s.length()];
33
34        int len =0 ;
35        int i=1;
36
37        while(i<s.length()){
38
39            if(s.charAt(i) == s.charAt(len)){
40                len++;
41                lps[i]=len;
42                i++;
43            }
44            else{
45                if(len!=0){
46                    len=lps[len-1];
47                }
48                else{
49                    lps[i]=0;
50                    i++;
51                }
52            }
53        }
54        return lps;
55    }
56
57}