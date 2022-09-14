class Solution {
    public int[] plusOne(int[] digits) {
        
        String s ="";
        
        for(int digit : digits){
            s+=digit+"";
        }
        
        int len = s.length();
        
        String ans="";
        int carry=1;
        
        for(int i =len-1;i>=0;i--){
            
            if(digits[i]<9 && carry==1){
                
                ans+=(digits[i]+1)+"";
                carry=0;
            }
            else if(digits[i]==9 && carry==1){
                
                ans+="0";
                carry=1;
            }else{
                
                ans+=digits[i]+"";
            }
        }
        if(carry==1)
            ans+="1";
        
     
        
        int[] output = new int[ans.length()];
        int j=0;
        for(int i= ans.length()-1;i>=0;i--){
            output[j++]=Character.getNumericValue(ans.charAt(i));
        }
       return output; 
    }
}