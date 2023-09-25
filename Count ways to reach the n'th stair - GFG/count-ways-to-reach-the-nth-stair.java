//{ Driver Code Starts
import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) {
		
		//taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total testcases
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    //taking count of stairs
		    int m = sc.nextInt();
		    
		    //creating an object of class DynamicProgramming
		    Solution obj = new Solution();
		    
		    //calling method countWays() of class
		    //DynamicProgramming
		    System.out.println(obj.countWays(m));
		    
		}
		
	}
}
// } Driver Code Ends


class Solution
{
    //Function to count number of ways to reach the nth stair.
    private int MOD= 1000000007;
    int countWays(int n)
    {
        if(n==0 || n==1){
            return 1;
        }
        // your code here
        int prev =1;
        int prev_prev = 1;
        int cur=0;
        
        for(int i=2;i<=n;i++){
            
            cur = (prev+ prev_prev)%MOD;
            
            prev_prev=prev;
            prev=cur;

        }
        
        return cur%MOD;
    }
}

