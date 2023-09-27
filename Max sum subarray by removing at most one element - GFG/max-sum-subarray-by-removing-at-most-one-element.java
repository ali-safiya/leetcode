//{ Driver Code Starts
import java.util.*;

import java.lang.Math;
import java.io.*;
class Subarray
{
	public static void main(String[] args)throws IOException
	{
    //     Scanner sc = new Scanner(System.in);
    // 	int t = sc.nextInt();
    
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //taking total testcases
        int t = Integer.parseInt(read.readLine());
    	while(t-->0)
    	{
    	    //taking number of elements
    		int n = Integer.parseInt(read.readLine());
    		int[] a = new int[n];
    		
    		String str[] = read.readLine().trim().split(" ");
    		
    		//inserting elements to the array
    		for(int i = 0;i < n; i++)
    			a[i] = Integer.parseInt(str[i]);
    		
    		Solution g = new Solution();
    		
    		//calling method maxSumSubarray() of 
    		//class GfG
    		System.out.println(g.maxSumSubarray(a , n));
    	}
	}
}
// } Driver Code Ends


/*Complete the function below*/


class Solution
{
    //Function to return maximum sum subarray by removing at most one element.
    public static int maxSumSubarray(int A[], int n)
    {
     //add code here.
     long[] fwSum = new long[n];
     
     long[] bwSum = new long[n];
     
     long max_so_far=Integer.MIN_VALUE;
     
     long sum=0;
     
     for(int i=0;i<n;i++){
         
    
         sum+=A[i];
         if(sum < A[i]){
             sum=A[i];
         }
         
         fwSum[i] = sum;
        //  System.out.println("fw :" + fwSum[i]+" ");
         max_so_far=Math.max(max_so_far,sum);
         
     }
     sum=0;
       
     for(int i=n-1;i>=0 ;i--){
         
    
         sum+=A[i];
         if(sum < A[i]){
             sum=A[i];
         }
         
         bwSum[i] = sum;
        // System.out.println("bw :" + bwSum[i]+" ");
         max_so_far=Math.max(max_so_far,sum);
     }
     
     for(int i=1;i<n-1;i++){
         max_so_far = Math.max(max_so_far,fwSum[i-1]+bwSum[i+1]);
     }
     return (int)max_so_far;
    }
}

