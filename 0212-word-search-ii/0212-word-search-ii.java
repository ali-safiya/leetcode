class Solution {
    
    class TrieNode{
        String word;
        TrieNode[] next = new TrieNode[26];
    }
    public List<String> findWords(char[][] board, String[] words) {
        
        List<String> ans = new ArrayList<String>();
        
        TrieNode root = buildTree(words);
        
        for(int i=0;i<board.length;i++){
            
            for(int j=0;j<board[0].length;j++){
                
                dfs(board,root,i,j,ans);
            }
        }
      return ans;  
        
    }
    
    void dfs(char[][] board, TrieNode root, int i, int j,List<String> res){
        
        char c = board[i][j];
        
        if(c=='#' ||  root.next[c-'a']==null)
            return ;
        root=root.next[c-'a'];
        
        if(root.word!=null){
            res.add(root.word);
            root.word=null;
        }
        
        board[i][j]='#';
        
        if(i>0){
            dfs(board,root,i-1,j,res);
        }
        if(j>0){
            dfs(board,root,i,j-1,res);
        }
        if(j < board[0].length-1){
            dfs(board,root,i,j+1,res);
        }
        if(i < board.length-1){
            dfs(board,root,i+1,j,res);
        }
        
        board[i][j]=c;
    }
    TrieNode buildTree(String[] words){
        
        TrieNode root = new TrieNode();
        
        for(String s :words){
            
            TrieNode tree = root;
            
            for(char c : s.toCharArray()){
                
                int index = c-'a';
                if(tree.next[index]==null)
                    tree.next[index] = new TrieNode();
                tree=tree.next[index];
            }
            
            tree.word= s;
            
        }
        
        return root;
    }
}