class Solution {
    public List<String> generateParenthesis(int n) {
        
        
        result= new ArrayList<String>();
        
        
          generate(n,n,"");
        return result;
        
    }
     List<String> result;
    
    void generate( int open ,int close, String s){
        
        
        if(open ==0 && close==0){
            result.add(s);
            return ;
        }
        
        if(open>0){
        
            generate(open-1,close,s+'(');
            
            
        }
        
        if(open<close){
        
            generate(open,close-1,s+')');
            
        }
        
        return ;
    }
}