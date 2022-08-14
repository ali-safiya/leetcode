class Solution {
    int i;
   
    public String decodeString(String s) {
        i=0;
      
        return decode(s);
        
    }
    
    String decode(String str ){
         String ans="";
    int num=0;
        while(i<str.length()){
            
        char c= str.charAt(i);
        
        
        if(Character.isLetter(c)){
         
            ans +=c;
              
            i++;
        }
         else if(Character.isDigit(c)){
            num = num*10 + Integer.valueOf(c-'0');
               
            i++;
        }
        else if(c == '['){
            i++;
            String temp = decode(str);
           
            for(int j=0;j<num;j++)
                ans+=temp;
             num=0;
            i++;
            
        }
        else
        return ans;
        }
        return ans;
            
    }
}