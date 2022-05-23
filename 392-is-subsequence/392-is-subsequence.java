class Solution {
    public boolean isSubsequence(String s, String t) {
        int len1 = s.length()+1;
        int len2 = t.length()+1;
        
        boolean[][] dp = new boolean[len1][len2];
        
        for(int i=1;i<len1;i++)
            dp[i][0]= false;
        for(int i=1;i<len2;i++)
            dp[0][i]= true;
        dp[0][0]=true;
        
        
        for(int i=1;i<len1;i++){
            for(int j=1;j<len2;j++){
                if(s.charAt(i-1)==t.charAt(j-1))
                    dp[i][j]= dp[i-1][j-1];
                else
                    dp[i][j]=dp[i][j-1];
            }
        }
        
        return dp[len1-1][len2-1];
        
    }
}