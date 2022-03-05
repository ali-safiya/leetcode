class Solution {
    public int[][] transpose(int[][] matrix) {
        int col =matrix[0].length;
        int row= matrix.length;
        
        int[][] transpose =new int[col][row];
        
        int m=0;
        int n=0;
        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
               
                transpose[i][j]=matrix[j][i];
            }
         
        }
        return transpose;
    }
}