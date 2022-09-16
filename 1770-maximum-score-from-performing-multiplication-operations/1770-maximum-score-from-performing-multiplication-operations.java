class Solution {
    public int maximumScore(int[] nums, int[] multipliers) {
        
        Integer[][] memo = new Integer[multipliers.length][multipliers.length];
        
        return findScore(memo,nums,multipliers,0,0);
        
    }
    
    int findScore(Integer[][] dp, int[] nums, int[] mult,int noOfop , int ind){
        
        if(noOfop==mult.length)
            return 0;
        
        if(dp[noOfop][ind]!=null)
            return dp[noOfop][ind];
        
        
        int res = Math.max(nums[ind]*mult[noOfop] + findScore(dp,nums,mult,noOfop+1,ind+1) ,
         nums[nums.length-1-(noOfop-ind)]* mult[noOfop]+ findScore(dp,nums,mult,noOfop+1,ind)
                           );
        
        return dp[noOfop][ind] = res;
    }
}