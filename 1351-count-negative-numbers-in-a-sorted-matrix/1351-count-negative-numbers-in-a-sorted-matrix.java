class Solution {
    public int countNegatives(int[][] grid) {
       int count=0;
        int row=grid.length;
        int col=grid[0].length;
        int i=0;
        int j=col-1;
        while(i<row)
        {
            if(grid[i][j]<0)
            {
                count++;
                j--;
            
            }
            else
            {
                i++;
                j=col-1;
            }
              if(j==-1 && i<row)
              {
                  j=col-1; 
                  i++;
              }
            
        }
        return count;
    }
}