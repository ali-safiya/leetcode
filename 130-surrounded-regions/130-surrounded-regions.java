class Solution {
    public void solve(char[][] board) {
        
        int[][]  dir={{0,1},{0,-1},{1,0},{-1,0}};
        
        Queue<int[]> q = new LinkedList<>();
        
        int r= board.length;
        int c= board[0].length;
        
        for(int i=0;i<r;i++){
            
            for(int j=0;j<c;j++){
                
                if((i==0 || j==0 || i==r-1 || j==c-1) && board[i][j]=='O' ){
                    
                    q.add(new int[]{i,j});
                    board[i][j]='#';
                }else
                    continue;
            }
        }
        
        while(!q.isEmpty()){
            
            int[] cordinates = new int[2];
            cordinates =q.remove();
            
            int x= cordinates[0];
            int y= cordinates[1];
            
            for(int i=0;i<4;i++){
                
                int dirX = x - dir[i][0];
                int dirY = y - dir[i][1];
                
                if(isValid(dirX,dirY,r,c,board)){
                    
                    board[dirX][dirY]= '#';
                    q.add(new int[]{dirX,dirY});
                }
                
                
            }
            
        }
        
        for(int i=0;i<r;i++){
            
            for(int j=0;j<c;j++){
                
                if(board[i][j]=='O')
                    board[i][j]='X';
                if(board[i][j]=='#')
                    board[i][j]='O';
            }
        }
        
        
    }
    boolean isValid(int x,int y, int row ,int col,char[][] board){
        
        if(x>-1 && x<row && y>-1 && y<col && board[x][y]=='O')
            return true;
        return false;
    }
}