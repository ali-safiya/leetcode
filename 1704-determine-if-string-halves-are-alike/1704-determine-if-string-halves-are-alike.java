class Solution {
    public boolean halvesAreAlike(String s) {
        
        int a=0;
        int b=0;
        int n = s.length();
        
        for(int i =0;i <n ;i++){
            
            char c = s.charAt(i);
            
            if(isVowel(c)){
                
                if(i < n/2){
                    a++;
                }
                else{
                    b++;
                }
            }
        }
        return a==b;
    }
    
    boolean isVowel(char c){
        
        if(c == 'a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' ||c=='u' || c=='U' )
            return true;
        return false;
    }
}