class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        for(int i=0;i<(row+1)/2;i++){
            
            for(int j=0;j<col/2 ;j++){
                
                
                int temp = matrix[i][j];
                
                matrix[i][j]= matrix[row-j-1][i];
                
                matrix[row-j-1][i]=matrix[row-i-1][col-j-1];
                
                matrix[row-i-1][col-j-1]= matrix[j][col-i-1];
                
                matrix[j][col-i-1] =temp;
            }
        }
    }
}