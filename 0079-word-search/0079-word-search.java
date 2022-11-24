class Solution {
    public boolean exist(char[][] board, String word) {
        
        
      
        int row = board.length;
        int col = board[0].length;
        
        for(int i =0; i<row ;i++){
            
            for(int j=0 ;j< col ;j++){
                
                if(board[i][j]== word.charAt(0)){
                    
                    if(solve(board , i , j,0,word))
                        return true;
                }
            }
        }
        return false;
    }   
        boolean solve(char[][] board, int i , int j,int ind , String word){
            
            if(ind == word.length())
                return true;
            
            if(i<0 || i>= board.length ||  j<0 || j>= board[0].length || (board[i][j] != word.charAt(ind)) || board[i][j]=='.'){
                return false;
            }
            char temp = board[i][j];
            
            board[i][j] = '.';
                
                if(solve(board,i-1,j,ind+1,word) || solve(board,i+1,j,ind+1,word) || solve(board,i,j-1,ind+1,word) || solve(board,i,j+1,ind+1,word))
                    return true;
                    
            board[i][j] = temp;
            return false;
        
        
    }
}