class Solution {
    public int surfaceArea(int[][] grid) {
        
        
        int area =0 ;
        int n = grid.length;
        
        for( int i =0 ;i< n ;i++ ){
    
            for(int j=0;j<n;j++){
                
                int side = grid[i][j];
                
                if(i-1 < 0)
                    area+=side;
                else if(side > grid[i-1][j]){
                    area+=side - grid[i-1][j];
                }
                if(i+1 >= n )
                    area+=side;
                else if(side > grid[i+1][j]){
                    area+=side - grid[i+1][j];
                }
                  if(j-1 < 0)
                    area+=side;
                else if(side > grid[i][j-1]){
                    area+=side - grid[i][j-1];
                }
                  if(j+1 >= n)
                    area+=side;
                else if(side > grid[i][j+1]){
                    area+=side - grid[i][j+1];
                }
                
                if(side !=0)
                    area+=2;
            }
        }
        return area;
    }
}