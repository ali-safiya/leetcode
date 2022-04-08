class Solution {
    public List<List<String>> solveNQueens(int n) {
        
        List<List<String>> ans = new ArrayList<List<String>>();
        
        char[][] board = new char[n][n];
        for(int i = 0 ; i < n ; i++){
         for(int j = 0 ; j < n ; j++){
            board[i][j] = '.';
             }         
        }
        solve(n,board,0,ans);
          return ans;  
    }
        
        List<String> construct (char[][] board ){
           List<String> list= new ArrayList<String>() ;
            for(int i=0;i<board.length;i++){
             String s= String.valueOf(board[i]);
                list.add(s);
            }
    return list;
        }
    
   void solve(int n, char[][] board,int col,List<List<String>> ans){
       if(col==n){
           ans.add(construct(board));
           return ;
       }
        
        for(int i=0;i<n;i++){
            if(isValid(i,col,n,board)){
                board[i][col]='Q';
            
            solve(n,board,col+1,ans);
            board[i][col]='.';
            }
        }
    }
    
    boolean isValid(int row,int col,int n,char[][] board){
        
          int dupRow = row;
        int dupCol = col;
        
        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q') return false;
            row--;
            col--;
        }
        
        row = dupRow;
        col = dupCol;
        //to check column
        while (col >= 0) {
            if (board[row][col] == 'Q') return false;
            col--;
        }
        
        row = dupRow;
        col = dupCol;
        
        while (row < board.length && col >= 0) {
            if (board[row][col] == 'Q') return false;
            row++;
            col--;
        }
        
        return true;
    }
}