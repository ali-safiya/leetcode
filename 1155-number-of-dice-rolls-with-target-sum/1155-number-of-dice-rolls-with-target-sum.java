class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        
        int[][] dp = new int[n+1][target+1];
        
        int mod = 1000000007;
        
        dp[0][0]=1;
        
        
        for(int N=1;N < n+1; N++){
            
            for(int tar=1;tar<target+1;tar++){
                
                
                int ans=0;
                
                for(int K=1;K<k+1 ;K++){
                    
                    if(tar - K >=0){
                        
                        ans=(ans + dp[N-1][tar-K]) % mod;
                    }
                }
                
                dp[N][tar]=ans;
                
                
            }
        }
        
        
        return dp[n][target];
        
    }
}