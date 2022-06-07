class Solution {
    public int[] countBits(int n) {
        
        int[] dp = new int[n+1];
        if (n==0) return dp;
        dp[0]=0;
        dp[1]=1;
        int p=1;
        
        int i=2;
        
        while(i!=n+1){
           
            if(Math.pow(2,p)==i)
            {
                dp[i]=1;
                p++;
            }
            else
                dp[i]=1+dp[i%(int)(Math.pow(2,p-1))];
            
            
            i++;
        }
        return dp;
    }
}