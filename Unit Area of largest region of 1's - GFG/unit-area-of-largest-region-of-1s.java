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
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.findMaxArea(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find unit area of the largest region of 1s.
    int dir[][] = new int[][]{{0,1},{1,0},{-1,0},{0,-1},{1,1},{-1,-1},{1,-1},{-1,1}};
    public int findMaxArea(int[][] grid)
    {
        // Code here
        
        int maxArea =0;
        
        for(int i=0;i< grid.length;i++){
            
            for(int j=0;j< grid[0].length;j++){
                
                if(grid[i][j]==1){
                  maxArea = Math.max(DFS(grid,i,j),maxArea);  
                }
            }
        }
        return maxArea;
    }
    
    int DFS(int[][] grid, int row, int col){
        
        grid[row][col]=-1;
        
        int count =1;
        for(int i=0;i<8;i++){
            
            int x= row + dir[i][0];
            int y= col + dir[i][1];
            
            if(isValid(grid,x,y)){
                count+= DFS(grid,x,y);
            }
        }
        return count;
    }
    
    boolean isValid(int[][] grid , int x , int y){
        
        if(x >=0 && y>=0 && x< grid.length && y< grid[0].length && grid[x][y] ==1 )
            return true;
        return false;
    }
}


