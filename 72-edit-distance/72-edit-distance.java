class Solution {
    public int minDistance(String word1, String word2) {
       int m=word2.length()+1;
       int n= word1.length()+1;
        
        int[][] dp= new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                
                if(i==0 || j==0){
                    dp[i][j] = (i==0) ? j : i;
                }
                else{
                   if(word2.charAt(i-1)==word1.charAt(j-1))
                       dp[i][j]=dp[i-1][j-1];
                    else
                        dp[i][j]=1+ Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                }
                //System.out.print(dp[i][j]+" ");
            }
             //System.out.println();
        }
        return dp[m-1][n-1];
    }
}