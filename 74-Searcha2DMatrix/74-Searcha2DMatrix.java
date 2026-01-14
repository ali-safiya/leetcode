// Last updated: 14/01/2026, 18:45:02
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3
4        int m = matrix.length;
5        int n = matrix[0].length;
6
7        int low =0;
8        int high =  m*n -1;
9
10        while(low<=high){
11
12            int mid = (low+high)/2;
13
14            if(matrix[mid/n][mid%n]==target){
15                return true;
16            }
17            else if(matrix[mid/n][mid%n] < target){
18                low=mid+1;
19            }
20            else{
21                high=mid-1;
22            }
23        }
24        return false;
25    }
26}