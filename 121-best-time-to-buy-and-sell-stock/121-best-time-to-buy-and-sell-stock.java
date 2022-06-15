class Solution {
    public int maxProfit(int[] prices) {
      int maxProfit=0;
      int n= prices.length;
        int[] dp =new int[n];
        dp[0]=prices[0];
        for(int i=1;i<n;i++){
            dp[i]=Math.min(prices[i],dp[i-1]);
            maxProfit=Math.max(maxProfit,prices[i]-dp[i]);
        }
        return maxProfit<0 ? 0:maxProfit;
    }
}