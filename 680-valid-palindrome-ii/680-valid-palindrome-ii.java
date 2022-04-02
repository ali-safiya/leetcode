class Solution {
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
    
        
       return  checkPalindrome(i,j,s,1);
        
    }
    
    boolean checkPalindrome(int left,int right,String s,int chance){
        if(chance<0)
            return false;
        if(left>=right)
            return true;
    
        
        if(s.charAt(left)==s.charAt(right))
            return checkPalindrome(left+1,right-1,s,chance);
        else{
            return checkPalindrome(left+1,right,s,chance-1) || checkPalindrome(left,right-1,s,chance-1);
        }
    }
}