class Solution {
    public String reverseWords(String s) {
        
        int n = s.length();
        StringBuilder ans = new StringBuilder(); 
        int i =n-1;
        int j=0;
        while(i>=0){
            
            if(s.charAt(i)== ' '){
                i--;
                continue;
            }
            j=i;
            
            while(j>=0 && s.charAt(j) != ' ' ){
                j--;
            }
           // System.out.println(i + " "+ j);
            ans.append(" " + s.substring(j+1,i+1));
            System.out.println(ans);
            
            i=j-1;
            
            
        }
        
        if(ans.length()>1){
            ans.deleteCharAt(0);
        }
        
        return ans.toString();
    }
}