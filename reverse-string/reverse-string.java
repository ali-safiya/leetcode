class Solution {
    public void reverseString(char[] s) {
        
        int n = s.length;
        reverse(s,n-1,0);
        
    }
    void reverse(char[] s , int len, int i){
        if(len<=i)
            return;
       
        char temp =s[i];
        s[i]=s[len];
        s[len]=temp;
    
        
        reverse(s,len-1,i+1);
        
    }
}