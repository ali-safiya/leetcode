class Solution {
    public char findTheDifference(String s, String t) {
        
        int ans=0;
        
        for(char c: s.toCharArray()){
            ans=ans^(int)c;
        }
         for(char c: t.toCharArray()){
            ans^=(int)c;
             

        }
        return (char)ans;
        
    }
}