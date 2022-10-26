class Solution {
    public String longestPalindrome(String s) {
        
        int n = s.length();
        
        boolean[][] dp = new boolean[n][n];
        
        for(int i=0;i<n;i++){
            dp[i][i]=true;
        }
        int maxLen=1;
        int start=0;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=true;
                start=i;
                maxLen=2;
            }
        }
        
        
        for(int k=3;k<=n;k++){
            
            for(int i= 0;i<n-k+1;i++){
                
                int j = k+i-1;
                
                if(s.charAt(i)==s.charAt(j)){
                    
                    if(dp[i+1][j-1]){
                        dp[i][j]=true;
                    if(maxLen < k){
                        maxLen = k;
                        start=i;
                    }
                    }  
                }
            }
        }
        
        return s.substring(start,start+ maxLen);
        
    }
}















