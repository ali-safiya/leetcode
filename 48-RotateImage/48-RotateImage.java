// Last updated: 13/01/2026, 01:45:34
1class Solution {
2    public void rotate(int[][] matrix) {
3        
4        int n = matrix.length;
5
6        for(int i=0;i< n;i++){
7            for(int j=i;j<n;j++){
8
9                int temp = matrix[i][j];
10                matrix[i][j] = matrix[j][i];
11                matrix[j][i] = temp;
12            }
13        }
14
15        for(int i=0;i<n;i++){
16            for(int j=0;j<n/2;j++){
17                
18                int temp = matrix[i][j];
19                matrix[i][j] = matrix[i][n-j-1];
20                matrix[i][n-j-1] = temp;
21            }
22        }
23    }
24}