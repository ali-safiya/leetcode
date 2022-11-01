class Solution {
    public int[] findBall(int[][] grid) {
        
        
        int r = grid.length;
        int c = grid[0].length;
        
        int[] result = new int[c];
        
        for(int i=0;i<c;i++){
            
            int curCol =i;
            
            for(int j =0;j<r;j++){
                
                int nextCol =curCol + grid[j][curCol];
                
                if(nextCol < 0 || nextCol > c-1 || grid[j][curCol] != grid[j][nextCol] ){
                    result[i]= -1;
                    break;
                }
            
            result[i]= nextCol;
            curCol =nextCol;
                
         }
        }
        
        return result;
        
    }
}