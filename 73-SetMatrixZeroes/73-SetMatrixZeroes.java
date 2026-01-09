// Last updated: 10/01/2026, 01:06:39
1class Solution {
2    public void setZeroes(int[][] matrix) {
3
4        int r = matrix.length;
5        int c = matrix[0].length;
6
7        boolean isRowZero = false;
8        boolean isColZero = false;
9
10        if(matrix[0][0] == 0 ){
11            isRowZero = true;
12            isColZero = true;
13        }
14
15        for(int i =0;i<r;i++){
16            for(int j=0;j<c;j++){
17
18                if(i==0 && matrix[i][j]==0){
19                    isRowZero = true;
20                }
21                if(j==0 && matrix[i][j] == 0){
22                    isColZero = true;
23                }
24                
25                if(matrix[i][j] == 0){
26                    matrix[i][0] = 0;
27                    matrix[0][j] = 0;
28                }
29            }
30        }
31
32        for(int i =1;i<c;i++){
33            if(matrix[0][i]==0){
34                for(int j = 1;j<r;j++){
35                    matrix[j][i]=0;
36                }
37            }
38        }
39
40        for(int i= 1;i<r;i++){
41            if(matrix[i][0]==0){
42                for(int j=1;j<c;j++){
43                    matrix[i][j]=0;
44                }
45            }
46        }
47        if(isRowZero){
48            for(int i =0 ;i<c;i++){
49                matrix[0][i]=0;
50            }
51        }
52        if(isColZero){
53            for(int i=0;i<r;i++){
54                matrix[i][0]=0;
55            }
56        }
57    }
58}