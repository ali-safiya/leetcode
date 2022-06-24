class Solution {
    public int orangesRotting(int[][] grid) {
        int row= grid.length;
        int col= grid[0].length;
        
         Queue<int[]> q = new LinkedList<int[]>();
        
         int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};
                     
         int time=0;
         int freshCount=0;
                     
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                
                if(grid[i][j]==2)
                   q.add(new int[]{i,j});
                if(grid[i][j]==1)
                    freshCount++;
            }
        }

        while(!q.isEmpty() && freshCount>0){
            int size=q.size();
            
            for(int i=0;i<size;i++ ){
            
            int[] que = q.remove();
            int x=que[0];
            int y=que[1];
          
            for(int k=0;k<4;k++){
                
                int n = x-dir[k][0];
                int m = y-dir[k][1];
                
                if(n>=grid.length || n<0 || m>=grid[0].length || m<0 || grid[n][m]!=1)
                   continue;
                   else{
                    
                    grid[n][m]=2;
                    q.add(new int[]{n,m});
                    freshCount--;
                }
            }
            }
               time++;
                
        }
         
   return freshCount==0? time :-1 ;
    }
}