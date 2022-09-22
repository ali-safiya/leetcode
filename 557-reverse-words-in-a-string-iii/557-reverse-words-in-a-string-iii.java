class Solution {
    public String reverseWords(String s) {
        
        String output="";
        
        String word="";
        
        for(int i=0;i<s.length();i++){
            
            char c=s.charAt(i);
            
            if(c == ' ' || i==s.length()-1){
                if(c== ' '){
                    StringBuilder str = new StringBuilder(word);
                    output+= str.reverse()+" ";
                }
                else
                {
                    word+=c;
                    StringBuilder str = new StringBuilder(word);
                    output+= str.reverse();
                    
                }
                word="";
            }else{
            
            word+=c;
            }
            
        }
        
        return output;
        
    }
}