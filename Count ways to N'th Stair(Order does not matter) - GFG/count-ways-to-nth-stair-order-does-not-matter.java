//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            long ans = ob.nthStair(n);
            System.out.println(ans);            
        }
    }
}

// } Driver Code Ends


class Solution
{
    public long nthStair(int n)
    {
        // Code here
        int[] dp = new int[n+1];
        
        for(int i=0;i<=n;i++){
            dp[i]=1;
        }
        
        for(int i=2;i<=n;i++){
            dp[i]=dp[i]+dp[i-2];
        }
        
        return dp[n];
    }
}