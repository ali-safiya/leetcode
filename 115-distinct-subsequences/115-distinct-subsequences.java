class Solution {
    public int numDistinct(String s, String t) {
        int len1 =t.length()+1;
        int len2 = s.length()+1;
        
        int[][] dp = new int[len1][len2];
        
        for(int i=0;i<len2;i++)
            dp[0][i]=1;
        
        for(int i=1;i<len1;i++){
            for(int j=1;j<len2;j++){
                if(s.charAt(j-1) ==t.charAt(i-1))
                    
                    dp[i][j]=dp[i-1][j-1]+ dp[i][j-1];
                else
                    dp[i][j]=dp[i][j-1];
                
                //System.out.print(dp[i][j]+ " ");
            }
           // System.out.println();
        }
        return dp[len1-1][len2-1];
    }
}