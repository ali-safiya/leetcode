//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
		int t = Integer.parseInt(br.readLine().trim());
		
	    while(t-- >0)
	    {
	        String inputLine[] = br.readLine().trim().split(" ");
	        
	        //taking n and sum
            int n = Integer.parseInt(inputLine[0]);
            int sum = Integer.parseInt(inputLine[1]);
            
            //calling largestNumber() function
            System.out.println(new Solution().largestNumber(n, sum));
	    }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to return the largest possible number of n digits
    //with sum equal to given sum.
    static String largestNumber(int n, int sum)
    {
        // add your code here
        String psw="";
        
        int x = sum/9;
        int rem= sum%9;
        
        if(x>n || (x==n && rem!=0)){
            return "-1";
        }
        
        while(x-->0){
            psw+="9";
            sum-=9;
        }

        // System.out.println(sum);
        if(sum>0){
            psw+=sum+"";
            sum=0;
        }
    
        while(psw.length()<n){
            psw+='0';
        }


        return  psw  ;
    }
}


