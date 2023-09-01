//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for(int i = 0; i < n; i++){
                String S = br.readLine().trim();
                for(int j = 0; j < m; j++){
                    grid[i][j] = S.charAt(j);
                }
            }
            Solution obj = new Solution();
            int ans = obj.xShape(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends




class Solution
{
    //Function to find the number of 'X' total shapes.
    int[][] dir = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
    public int xShape(char[][] grid)
    {
        // code here
        
        int count =0;
        
        for(int i=0;i<grid.length;i++){
            
            for(int j=0;j< grid[0].length;j++){
                
                if(grid[i][j]=='X'){
                    
                    DFS(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    
    void DFS(char[][] grid , int row , int col){
        
        grid[row][col]='O';
        
        
        for(int i=0;i<4;i++){
            
            int x = row + dir[i][0];
            int y = col + dir[i][1];
            
            if(isValid(grid,x,y)){
                DFS(grid,x,y);
            }
            
        }
        
    }
    
    boolean isValid(char[][] grid , int x , int y){
        
        if(x >= 0 && y>=0 && x < grid.length && y < grid[0].length && grid[x][y]=='X')
            return true;
            
        return false;
    }
}