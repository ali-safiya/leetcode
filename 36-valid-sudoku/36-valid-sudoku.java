class Solution {
    public boolean isValidSudoku(char[][] board) {
       
        HashMap<Integer,HashSet<Character>> row = new HashMap<Integer,HashSet<Character>>();
       HashMap<Integer,HashSet<Character>> col = new HashMap<Integer,HashSet<Character>>();
       
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    row.putIfAbsent(i,new HashSet<>());
                   col.putIfAbsent(j,new HashSet<>());
                    if(! row.get(i).add(board[i][j])) {
                         return false;}
                     if(! col.get(j).add(board[i][j]))
                         return false;
                   
                }
            }
        }
      
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                 HashSet<Character> box = new HashSet<>(); 
                int r= 3*i;
                int c=3*j;
                for(int k=r;k<r+3;k++){
                    for(int l=c;l<c+3;l++){
                        if(board[k][l]!='.'){
                            if(box.contains(board[k][l])) return false;
                            box.add(board[k][l]);
                        }
                    }
                }
            }
        }
        
       return true; 
    }
}