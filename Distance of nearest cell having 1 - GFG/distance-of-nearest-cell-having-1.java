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
            int[][] ans = obj.nearest(grid);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find distance of nearest 1 in the grid for each cell.
    int[][] dir = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
    public int[][] nearest(int[][] grid)
    {
        // Code here
        int n = grid.length;
        int m = grid[0].length;
        int[][] ans = new int[n][m];
        
        Queue<int[]> q = new LinkedList<int[]>();
        
        for(int i=0;i<n;i++){
            
            for( int j=0;j<m;j++){
                
                if(grid[i][j]==1){
                    grid[i][j]=-1;
                    q.add(new int[]{i,j,1});
                    ans[i][j]=0;
                }
                else{
                    ans[i][j]=-1;
                }
            }
        }
        
        
        while(!q.isEmpty()){
            
            int[] cur = q.poll();
            // System.out.println(cur[2]);
            for(int i=0;i<4;i++){
                int x= dir[i][0] + cur[0];
                int y= dir[i][1] + cur[1];
                
                if(x>=0 && x< n && y>=0 && y< m && grid[x][y]==0 ){
                    
                    q.add(new int[]{x,y,cur[2]+1});
                    // System.out.println(cur[2]);
                    grid[x][y]=-1;
                
                        // System.out.println(cur[2]);
                    ans[x][y] = cur[2];
                
                    
                }
                
            }
        }
        return ans;
    }
}