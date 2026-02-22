// Last updated: 23/02/2026, 03:32:23
1class Solution {
2    public String reverseWords(String s) {
3
4        int n = s.length();
5
6        int i = n-1;
7        int j = n-1;
8
9        String reverse ="";
10
11        while(j>=0){
12
13            while(j>=0 && s.charAt(j) == ' ' ){
14                j--;
15            }
16            if(j<0) break;
17            i=j;
18            while(i>=0 && s.charAt(i)!= ' '){
19                i--;
20                
21            }
22            if(reverse.length() > 0) reverse+=" ";
23            reverse += s.substring(i+1,j+1);
24            j=i;
25            
26        }
27        return reverse;
28    }
29}