class Solution {
    public int coinChange(int[] coins, int amount) {
     
        int n=coins.length;
        int[][] dp = new int[n+1][amount+1];
        
        for(int i=0;i<n+1;i++){
            
            for(int j=0;j<amount+1;j++){
                 if(j==0)
                    dp[i][j]=0;
                else if(i==0)
                    dp[i][j]=(int)1e5;
                else if(coins[i-1]>j)
                    dp[i][j] = dp[i-1][j];
                else
                    {
                   dp[i][j] = Math.min(1+dp[i][j-coins[i-1]], dp[i-1][j]);
                }
                
              
            }
        }
        int ans=dp[n][amount];
        return ans>(int)1e4 ? -1: ans;
    }
}