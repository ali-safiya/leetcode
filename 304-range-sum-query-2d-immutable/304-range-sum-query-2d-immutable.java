class NumMatrix {
  int[][] prefixSum;
    public NumMatrix(int[][] matrix) {
       int n=matrix[0].length;
       int m=matrix.length;
         prefixSum= new int[m][n];
      
  
        
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0)
                    prefixSum[i][j]=matrix[i][j];
                else
                prefixSum[i][j]=prefixSum[i][j-1]+matrix[i][j];
            }
        }
       
        
          for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(j==0)
                  prefixSum[j][i]= prefixSum[j][i];
                    else
                prefixSum[j][i]=prefixSum[j-1][i]+prefixSum[j][i];
            }
        }
      
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
    
        if(row1==0 && col1==0)
            return prefixSum[row2][col2];
        else if(row1==0)
            return prefixSum[row2][col2]-prefixSum[row2][col1-1];
        else if(col1==0)
             return prefixSum[row2][col2]-prefixSum[row1-1][col2];
       else
           return prefixSum[row2][col2]-prefixSum[row1-1][col2]-prefixSum[row2][col1-1]+prefixSum[row1-1][col1-1];
 
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */