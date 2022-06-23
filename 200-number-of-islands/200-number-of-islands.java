class Solution {
    public int numIslands(char[][] grid) {
        
        int row = grid.length;
        int col = grid[0].length;
        
        boolean[][] visited = new boolean[row][col];
        
        int count=0;
        
        for(int i=0;i<row;i++){
            
            for(int j=0;j<col;j++){
                
                if(grid[i][j]=='1' && visited[i][j] == false){
                    
                    dfs(grid,i,j,visited);
                    count++;
                }
            }
        }
        
        return count;
        
    }
    
    void dfs(char[][] grid ,int i,int j,boolean[][] visited){
        
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || visited[i][j]==true || grid[i][j]=='0')
            return;
        
        visited[i][j]=true;
        dfs(grid,i,j-1,visited);
        dfs(grid,i+1,j,visited);
        dfs(grid,i,j+1,visited);
        dfs(grid,i-1,j,visited);
    }
}