//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    //taking the String
		    String s=sc.nextLine();
		    Solution ob = new Solution();
		    //calling method sumSubstrings() 
		    System.out.println(ob.sumSubstrings(s));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find sum of all possible substrings of the given string.
    private static int MOD= 1000000007;
    public static long sumSubstrings(String s)
    {
    //Your code here
    
        int n = s.length();
        
        long[] dp = new long[n];
        long res= s.charAt(0)-'0';
        dp[0]= s.charAt(0)-'0';
        
        for(int i=1;i<n;i++){
            long ch = s.charAt(i)-'0';
            
            dp[i] += (((i+1)*ch)%MOD + (10*dp[i-1])%MOD)%MOD  ;
            res=(dp[i]+ res)%MOD;
            // System.out.println(dp[i] +" "+ res+" "+ dp[i-1]);
        }
        return res%MOD;
    }
}