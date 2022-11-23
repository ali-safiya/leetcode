class Solution {
    public boolean isValidSudoku(char[][] board) {
        
   
        
        HashMap<Integer,HashSet<Character>> row = new HashMap<Integer,HashSet<Character>>();
        HashMap<Integer,HashSet<Character>> col = new HashMap<Integer,HashSet<Character>>();

        
        for(int i=0;i<9;i++){
            
            for(int j=0;j < 9 ;j++){
                if(board[i][j]!='.'){
                    row.putIfAbsent(i,new HashSet<Character>());
                    col.putIfAbsent(j,new HashSet<Character>());
                
                    if(!row.get(i).add(board[i][j]))
                        return false;
                    if(!col.get(j).add(board[i][j]))
                        return false;
                }
            }
        }
        
        for(int i=0;i<3;i++){
            
            for(int j=0;j<3;j++){
                
                HashSet<Character> set = new HashSet<>();
                
                for(int r = 3*i ;r < (3*i)+3 ;r++){
                    
                    for(int c = 3*j ;c< (3*j)+3 ;c++ ){
                        
                        if(board[r][c]!= '.'){
                            if(!set.add(board[r][c]))
                                return false;
                        }
                    }
                }
            }
        }
            
       return true;
        
        
        
    }
}