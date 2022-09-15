class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        
        
        int[][] dir = {{0,1},{-1,0},{0,-1},{1,0},{1,1},{-1,-1},{1,-1},{-1,1}};
        
        int r= grid.length;
        int c= grid[0].length;
        
        if(r==1 && c==1 && grid[0][0]==0)
            return 1;
        
        if(grid[0][0]!=0 || grid[r-1][c-1]!=0)
            return -1;
        
        grid[0][0]=1;
        
        
        Queue<int[]> q = new LinkedList<int[]>();
        
        q.add(new int[]{0,0});
        
        while(!q.isEmpty()){
            
            int[] cordinates = new int[2];
            cordinates = q.remove();
            
            int x= cordinates[0];
            int y= cordinates[1];
            
            for(int i=0;i<8;i++){
                
                int dirX =x- dir[i][0];
                int dirY =y- dir[i][1];
                
                if(isValid(dirX,dirY,r,c,grid)){
                    
                    q.add(new int[]{dirX,dirY});
                    grid[dirX][dirY]=1+ grid[x][y];
                    if(dirX==r-1 && dirY==c-1)
                        return grid[dirX][dirY];
                }
                
            }     
        }
        return -1;
    }
    boolean isValid(int x, int y, int row, int col,int[][] grid ){
        
        if(x>-1 && x<row && y>-1 && y<col && grid[x][y]==0)
            return true;
        
        return false;
    }
}