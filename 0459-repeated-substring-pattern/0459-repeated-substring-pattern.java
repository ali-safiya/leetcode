class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        int n= s.length();
        
        for(int i = n/2; i>=1;i--){
            if(n%i==0){
            String subStr = s.substring(0,i);
            
            int m = n/i;
            
            StringBuilder str = new StringBuilder();
            
            for(int j=0;j<m;j++){
                str.append(subStr);
            }
            
            if(s.equals(str.toString())) return true;
            }
        }
        
        return false;
    }
}