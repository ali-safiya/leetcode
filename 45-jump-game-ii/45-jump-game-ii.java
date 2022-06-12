class Solution {
    public int jump(int[] nums) {
       int n = nums.length;
        int[] dp = new int[n];
        
        Arrays.fill(dp,Integer.MAX_VALUE);
      dp[0]=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<nums[i];j++){
               if((i+j+1)>=n )
                   continue;
                dp[i+j+1]=Math.min(dp[i+j+1],1+dp[i]);
                //System.out.println(dp+" "+ i+ " "+j+ dp[i]+ " "+ dp[i+j+1]);
            }
          
        }
        return dp[n-1];
    }
}