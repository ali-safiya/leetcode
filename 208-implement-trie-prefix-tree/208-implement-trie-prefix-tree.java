class TrieNode{
    boolean isEnd;
    TrieNode[] link; 
    TrieNode(){
        isEnd=false;
        link = new TrieNode[26];
    }
}

class Trie {
    TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        
        TrieNode cur = root;
        
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(cur.link[c-'a']==null){
                cur.link[c-'a']= new TrieNode();
            }
            cur=cur.link[c-'a'];
        }
        cur.isEnd=true;
        
    }
    
    public boolean search(String word) {
        TrieNode cur=root;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(cur.link[c-'a']==null)
                return false;
            else{
                cur=cur.link[c-'a'];
            }
        }
        return cur.isEnd;
        
    }
    
    public boolean startsWith(String word) {
        
         TrieNode cur=root;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(cur.link[c-'a']==null)
                return false;
            else{
                cur=cur.link[c-'a'];
            }
        }
        return true;
        
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */