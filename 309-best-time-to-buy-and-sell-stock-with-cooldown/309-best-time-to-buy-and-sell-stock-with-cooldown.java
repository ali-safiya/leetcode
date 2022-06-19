class Solution {
    public int maxProfit(int[] prices) {
      int n = prices.length;
        if( n==1) return 0;
        int[][] dp = new int[n+2][2];
        
        dp[n+1][0]=0;
          dp[n+1][1]=0;
          dp[n][0]=0;
          dp[n][1]=0;
        
        int profit=0;
        
        for(int i =n-1;i>=0;i--){
            
            for(int buy=0;buy<=1;buy++){
                
                    if(buy==1)
                        dp[i][buy]= Math.max(-prices[i] + dp[i+1][0], dp[i+1][1]);
                    else
                        dp[i][buy]=Math.max(prices[i]+ dp[i+2][1],dp[i+1][0]);
            }
        }
    
        
        return dp[0][1];
    }
}