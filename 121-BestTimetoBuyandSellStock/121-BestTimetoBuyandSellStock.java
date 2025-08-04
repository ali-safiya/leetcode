// Last updated: 04/08/2025, 12:03:47
class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit = Integer.MIN_VALUE;
        int curMin = Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++){

            if(prices[i] < curMin){ curMin= prices[i];}
            maxProfit = Math.max(maxProfit, prices[i]-curMin);
        }

        return maxProfit;
    }
}