class Solution {
    public List<String> letterCasePermutation(String s) {
        
        List<String> result = new ArrayList<String>();
        
        return findCombinations(result,s,0);
    }
    
    List<String>  findCombinations(List<String> result,String s,int index){
        
        if(index==s.length()){
            result.add(s);
            return result;
        }
        
        
       int i=index;
            
            if(Character.isDigit(s.charAt(i)))
                findCombinations(result,s,i+1);
            else{
                if(Character.isLowerCase(s.charAt(i))){
                    findCombinations(result,s,i+1);
                    char c= Character.toUpperCase(s.charAt(i));
                    String temp="";
                    if(i!=0)
                    temp=s.substring(0,i)+c+s.substring(i+1,s.length());
                    else
                    temp =c+s.substring(i+1,s.length());  
                    
                    findCombinations(result,temp,i+1);
                    
                
                }
                else{
                     findCombinations(result,s,i+1);
                    char c= Character.toLowerCase(s.charAt(i));
                    String temp="";
                    if(i!=0)
                    temp=s.substring(0,i)+c+s.substring(i+1,s.length());
                    else
                         temp=c+s.substring(i+1,s.length());
                    findCombinations(result,temp,i+1);
                    
                }  
        }
        return result;
    }
}