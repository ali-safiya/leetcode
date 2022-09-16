class Solution {
    public boolean isPalindrome(String s) {
        
        int i=0;
        int j=s.length()-1;
        
        while(i<=j){
            
            char firstChar = s.charAt(i);
            char lastChar = s.charAt(j);

            if(!((firstChar >='0' && firstChar <='9') || (firstChar >='a' && firstChar <='z') || (firstChar >='A' && firstChar <='Z'))){
    
                i++;
                continue;
            }
            if(!((lastChar >='0' && lastChar <='9') || (lastChar >='a' && lastChar <='z') || (lastChar >='A' && lastChar <='Z'))){
    
                j--;
                continue;
            }
 
            if(firstChar >='A' && firstChar <='Z'){
                firstChar= Character.toLowerCase(firstChar);

            }
            if(lastChar >='A' && lastChar <='Z'){
                lastChar= Character.toLowerCase(lastChar);
            }
            if(firstChar!=lastChar)
                return false;
            else{
                i++;
                j--;
            }
                
            
        }
        return true;
        
    }
}