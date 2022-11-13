class Solution {
    public String reverseWords(String s) {
        
       int n=s.length();
       int j=n-1;
       int i=0;
        
       StringBuilder ans = new StringBuilder();
        
        while(j>=0){
            
            if(s.charAt(j) == ' '){
                j--;
                continue;
            }
            i=j;
            while(i>=0 && s.charAt(i)!= ' '){
                i--;
            }
            
            ans.append(" " + s.substring(i+1,j+1));
           
            
            j=i-1;
        }
        
        if(ans.length()>1)
            ans.deleteCharAt(0);
        
        return ans.toString();
    }
}