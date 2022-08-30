class CombinationIterator {
    
    ArrayList<String> list = new ArrayList<String>();
    int i=0;
    public CombinationIterator(String characters, int combinationLength) {
        
       findCombinations(characters,combinationLength,list,"",0); 
        System.out.println(list);
    }
    
    public String next() {
        String s="";
        if(i<list.size()){
           
            s =list.get(i);
            i++;
            
        }
         return s;   
        
    }
    
    public boolean hasNext() {
        if(i<list.size())
            return true;
        return false;
    }
    
    public void findCombinations(String str, int n, ArrayList<String> ans,String s,int ind){

        if(s.length()==n){
            ans.add(s);
            return;
        }
        if(ind == str.length())
            return ;
        
        findCombinations(str,n,ans,s+str.charAt(ind),ind+1);
        findCombinations(str,n,ans,s,ind+1);
        
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */