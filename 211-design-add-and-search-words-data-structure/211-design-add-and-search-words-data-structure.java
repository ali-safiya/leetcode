class WordDictionary {
    boolean last;
    WordDictionary[] arr;

    public WordDictionary() {
        last=false;
        arr= new WordDictionary[26];
        
    }
    
    public void addWord(String word) {
        WordDictionary cur = this;
        for(int i =0;i< word.length();i++){
            char c= word.charAt(i);
            if(cur.arr[c-'a']==null)
                cur.arr[c-'a'] = new WordDictionary();
            cur=cur.arr[c-'a'];  
            
        }
        cur.last =true;
        
    }
    
    public boolean search(String word) {
         WordDictionary cur = this;
        
        for(int i =0;i< word.length();i++){
            char c= word.charAt(i);
            
            if(c=='.'){
                for(WordDictionary child : cur.arr){
                    
                    if(child!=null && child.search(word.substring(i+1)) )
                        return true;
                }
                return false;
            }
            if(cur.arr[c-'a']==null)
                return false;
            cur=cur.arr[c-'a'];
        }
        return  cur!=null && cur.last;
        
      
    }
        
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */