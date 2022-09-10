class Solution {
    
     Integer[][][] dp =new Integer[1001][2][101];
        
    
    public int maxProfit(int k, int[] prices) {
        
        return helper(prices,k,0,1);
    }
    int helper(int[] prices , int k , int ind,int buy){
        
         if(k==0)
            return 0;
        
        if(ind==prices.length)
            return 0;
       
        if(dp[ind][buy][k]!=null)
            return dp[ind][buy][k];
        
        if(buy==1){
            dp[ind][buy][k]= Math.max((-prices[ind]+helper(prices,k,ind+1,0)), helper(prices,k,ind+1,1));
            return dp[ind][buy][k];
        }
        else{
             dp[ind][buy][k]= Math.max((prices[ind]+helper(prices,k-1,ind+1,1)), helper(prices,k,ind+1,0));
            return dp[ind][buy][k];
        }
            
    }
}