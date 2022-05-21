class Solution {
    public int numSquares(int n) {
      int size = (int)Math.sqrt(n);
      int[] nums = new int[n];
      for(int i=0;i<n;i++){
          nums[i]=(i+1)*(i+1);
      }
        int[][] dp = new int[size][n+1];
        
        for(int i=0;i<=n;i++){
            if(i%nums[0]==0){
                dp[0][i]= i/nums[0];
            }
            else
            {
                dp[0][i]=Integer.MAX_VALUE;
            }
        }
        
        for(int i=1;i<size;i++){
            for(int j=0;j<=n;j++){
                int notTake= dp[i-1][j];
                int take= Integer.MAX_VALUE;
                if(nums[i]<=j){
                    take= 1+ dp[i][j-nums[i]];
                }
                dp[i][j]=Math.min(take,notTake);
            }
        }
        
        return dp[size-1][n]==Integer.MAX_VALUE?-1: dp[size-1][n];
    }
}