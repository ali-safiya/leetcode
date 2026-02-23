// Last updated: 24/02/2026, 01:20:57
1class Solution {
2    public String longestPalindrome(String s) {
3        int n = s.length();
4
5        boolean[][] dp = new boolean[n][n];
6
7        int[] ans = new int[2];
8
9        for(int i=0;i<n;i++){
10            dp[i][i] = true;
11        }
12
13        for(int i=0;i<n-1;i++){
14            if(s.charAt(i)== s.charAt(i+1)){
15                dp[i][i+1]= true;
16                ans[0]=i;
17                ans[1]=i+1;
18            }
19        }
20
21        for(int diff =2;diff<n;diff++){
22            for(int i=0;i<n-diff;i++){
23                int j= i+diff;
24                if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1]){
25                    dp[i][j] = true;
26                    ans[0]=i;
27                    ans[1]=j;
28                }
29            }
30        }
31        int i= ans[0];
32        int j= ans[1];
33        return s.substring(i,j+1);
34    }
35}