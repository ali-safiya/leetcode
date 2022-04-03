// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
      return sort (arr,0,arr.length-1);
    }
    
   private static long sort(long arr[],int l,int r){
       long count=0;
        if(l<r){
            int m=l+(r-l)/2;
            count +=sort(arr,l,m);
            count+=sort(arr,m+1,r);
            count+=  merge(arr,l,m,r);
        }
        
        return count;
    }
    
    private static long merge(long arr[],int l,int m,int r){
        int n1=m-l+1;
        int n2=r-m;
        long count=0;
        long[] L = new long[n1];
        long[] R = new long[n2];
        
        
        for(int i=0;i<n1;i++)
            L[i]=arr[l+i];
            
        for(int i=0;i<n2;i++)
            R[i]=arr[m+1+i];
        
        int i=0,j=0,k=l;
            
        while(i<n1 && j<n2){
            
            if(L[i]<=R[j]){
                
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                count+=n1-i;
                j++;
            }
            k++;
        }
        
        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }
        return count;
    }
}





