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
            int n = Integer.parseInt(br.readLine().trim());
            int[][] grid = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            boolean ans = obj.is_Possible(grid);
            if(ans)
                System.out.println("1");
            else 
                System.out.println("0");
        }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to find whether a path exists from the source to destination.
    int[][] dir = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
    public boolean is_Possible(int[][] grid)
    {
        // Code here
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j< grid[0].length;j++){
                
                if(grid[i][j]==1){
                    if(DFS(grid,i,j)){
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
        
    boolean DFS(int[][] grid, int r, int c){
            
        if(grid[r][c]==2){
            // System.out.println( "r c" + r + " "+ c);
            return true;
        }
        grid[r][c]=0;
        for(int i=0;i<4;i++){
                
            int x= r+ dir[i][0];
            int y= c+ dir[i][1];
            
            if(isValid(grid,x,y)){

                if(DFS(grid,x,y))
                    return true;
                    
            }
            
        }
        return false;
    }
    
    boolean isValid(int[][] grid , int x ,int y){
        
        if(x >= 0 && y>=0 && x < grid.length && y < grid[0].length && (grid[x][y]==3 || grid[x][y]==2))
            return true;
        return false;
    }
}