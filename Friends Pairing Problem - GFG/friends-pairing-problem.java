// { Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.countFriendsPairings(n));
                }
        }
}    // } Driver Code Ends


//User function Template for Java

class Solution
{
    int MOD=1000000000    + 7;
    public long countFriendsPairings(int n) 
    { 
       //code here
       if(n<=2)
       return n;
       long a=1;
       long b=2;
       long c=0;
       for(int i=3;i<=n;i++){
           c=( b+( ((i-1)*a %MOD )%MOD)%MOD)%MOD;
          
           a=b;
           b=c;
       }
       return c;
    }
}    
 