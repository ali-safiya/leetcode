// Last updated: 17/01/2026, 00:14:56
1class Solution {
2    public int uniquePaths(int m, int n) {
3
4        int[] prev = new int[n];
5        int[] cur = new int[n];
6
7        prev[0] =1;
8
9        for(int i=0;i<m;i++){
10            for(int j=0;j<n;j++){
11
12                if(j<= 0){cur[j]=prev[j];}
13
14                else {cur[j] = prev[j] + cur[j-1];}
15            }
16            prev = cur;
17        }
18        return cur[n-1];
19    }
20}