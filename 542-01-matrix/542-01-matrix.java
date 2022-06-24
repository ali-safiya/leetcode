class Solution {
    public int[][] updateMatrix(int[][] mat) {
        
        int row = mat.length;
        int col = mat[0].length;
        Queue<int[]> q = new LinkedList<int[]>();
        
        
        int[][] dir={ {0,1},{0,-1},{1,0},{-1,-0}};
        
        for(int i=0;i<row;i++){
            
            for(int j=0;j<col;j++){
                
                if(mat[i][j]==0){
                    q.add(new int[]{i,j});
                }
                else
                    mat[i][j]=-1;
                
            }
        }
        
        while(!q.isEmpty()){
            
            int[] temp= new int[2];
            temp=q.remove();
            
            int x=temp[0];
            int y=temp[1];
            
            for(int i=0;i<4;i++){
                
                int newR = x-dir[i][0];
                int newC = y-dir[i][1];
                
                if(newR>=0 && newR<row && newC>=0 && newC<col && mat[newR][newC]==-1)
                {
                    mat[newR][newC]= 1+ mat[x][y];
                    q.add(new int[]{newR,newC});
                }
            }
        }
        
        
        return mat;
        
    }
}