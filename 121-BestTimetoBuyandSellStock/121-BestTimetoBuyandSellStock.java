// Last updated: 12/01/2026, 02:03:23
1class Solution {
2    public int maxProfit(int[] prices) {
3
4        int profit = -1;
5        int buy = prices[0];
6
7        for(int i=1;i<prices.length;i++){
8
9            profit = Math.max(profit,prices[i]-buy);
10            buy= Math.min(buy,prices[i]);
11
12        }
13
14        return profit < 0 ? 0 : profit;
15
16    }
17}