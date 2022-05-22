class Solution {
    public int longestPalindromeSubseq(String s) {
       
        // StringBuilder rev = new StringBuilder(s);
        // rev.reverse();
        // String reversedString = 
        
         int l = s.length() + 1;
       
        
        int[][] dp = new int[l][l];
        
        for(int i=0;i<l;i++)
            dp[i][0]= 0;
         for(int i=0;i<l;i++)
            dp[0][i]= 0;
        
        
        for(int i=1;i<l;i++){
            for(int j=1;j<l;j++){
                
                if(s.charAt(i-1)==s.charAt(l-j-1))
                    dp[i][j]=1 + dp[i-1][j-1];
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        
        return dp[l-1][l-1];
    }
}