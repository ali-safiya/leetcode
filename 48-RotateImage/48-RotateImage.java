// Last updated: 13/01/2026, 01:39:45
1class Solution {
2    public void rotate(int[][] matrix) {
3        int row = matrix.length;
4        int col = matrix[0].length;
5        
6        for(int i=0;i<(row+1)/2;i++){
7            
8            for(int j=0;j<col/2 ;j++){
9                
10                
11                int temp = matrix[i][j];
12                
13                matrix[i][j]= matrix[row-j-1][i];
14                
15                matrix[row-j-1][i]=matrix[row-i-1][col-j-1];
16                
17                matrix[row-i-1][col-j-1]= matrix[j][col-i-1];
18                
19                matrix[j][col-i-1] =temp;
20            }
21        }
22    }
23}