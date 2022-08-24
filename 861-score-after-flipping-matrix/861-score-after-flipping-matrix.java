class Solution {
    public int matrixScore(int[][] grid) {
        
        int row = grid.length;
        int col= grid[0].length;
        
        for(int i=0;i<row;i++){
            if(grid[i][0]==0)
                flipRow(i,grid,col);
        }
        
        for(int r =0;r< row;r++){
             for(int c=1; c<col;c++){
                 if(colhaslessones(grid,row,c)){
                     flipCol(c,grid,row);
                 }
            
            }
        }
        
        int totalSum=0;
        for(int r =0;r< row;r++){
            int sum=0;
             for(int c=0; c<col;c++){
                 if(grid[r][c]==1)
                     sum+= (int)Math.pow(2,col-c-1);
             }
            totalSum+=sum;
        }
    return totalSum;             
       
        
    }
    void flipRow(int ind ,int[][] grid, int col){
        
        for(int i=0;i<col;i++){
            if(grid[ind][i]== 0)
                grid[ind][i] =1;
            else
                grid[ind][i] =0;
        }
    }
     void flipCol(int ind ,int[][] grid, int row){
        
        for(int i=0;i<row;i++){
            if(grid[i][ind]== 0)
                grid[i][ind] =1;
            else
                grid[i][ind] =0;
        }
    }
    boolean colhaslessones(int[][] grid, int row, int ind ){
        int noOfones=0;
        for(int i=0;i<row;i++){
            if(grid[i][ind]==1)
                noOfones++;
        }
        return noOfones < (row - noOfones);
    }
    
}