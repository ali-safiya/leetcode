class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0]=nums[0];
        int pick=0,notPick=0;
        for(int i =1;i<n;i++){
            if(i>1)
                pick = nums[i] + dp[i-2];
            else
                pick=nums[i];
            notPick = dp[i-1];
            
            dp[i]= Math.max(pick,notPick);
            
        }
        return dp[n-1];
    }
}                                                                         