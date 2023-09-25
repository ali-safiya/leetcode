//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG implements Runnable {
    public void run() {
        try {
            BufferedReader in;
            PrintWriter out;
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            int t = Integer.parseInt(in.readLine());

            while (t-- > 0) {
                int n = Integer.parseInt(in.readLine().trim());

                Solution g = new Solution();
                out.println(g.countWays(n));
            }
            out.close();
        } catch (Exception e) {
            ;
        }
    }

    public static void main(String args[]) throws IOException {
        new Thread(null, new GFG(), "whatever", 1 << 26).start();
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to count the number of ways in which frog can reach the top.
    private static int MOD =1000000007;
    static long countWays(int n)
    {
        // add your code here
        if(n==1 || n==2){
           return n; 
        }
        if(n==0){
            return 1;
        }
        int a=1;
        int b=1;
        int c=2;
        
        int ways =0;
        for(int i=3;i<=n;i++){
            ways = ((a+b)%MOD+c)%MOD;
            
            a=b;
            b=c;
            c=ways;
        }
        
        return ways;
    }
    
}

