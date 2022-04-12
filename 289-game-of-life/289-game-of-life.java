class Solution {
    public void gameOfLife(int[][] board) {
        
        int m= board.length;
        int n=board[0].length;
        
        int count=0;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                
                count=-board[i][j];
                for(int k=Math.max(0,i-1);k<Math.min(i+2,m);k++){          
                    for(int l=Math.max(0,j-1);l<Math.min(j+2,n);l++){
                       
                        count+=board[k][l] & 1;
                    }
                }
                
                if(board[i][j]==0 && count ==3){
                    board[i][j]=2;
                }
                if(board[i][j]==1 && (count<2 || count>3 )){
                    board[i][j]=3;
                }
            }
        }
       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               if(board[i][j]==2)
                   board[i][j]=1;
               if(board[i][j]==3)
                   board[i][j]=0;
           }
       } 
    }
}