class Solution {
    public int uniquePaths(int m, int n) {
       int[][] dp= new int[m+1][n+1];
        for(int[] arr: dp)
        Arrays.fill(arr,-1);
        return  findWays(dp,m,n);
     
       
    }
    int findWays(int[][] dp,int m,int n){
       
        if(dp[m][n]!=-1) return dp[m][n];
          
        if(m==1 || n==1)
            return 1;
        int ways=0;
        
        ways=findWays(dp,m-1,n);
        ways+=findWays(dp,m,n-1);
      
        dp[m][n]=ways;
        return ways;
    }
}