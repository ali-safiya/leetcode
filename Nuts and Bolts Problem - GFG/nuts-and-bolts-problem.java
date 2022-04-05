// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            char[] nuts = new char[n], bolts = new char[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                nuts[i] = (inputLine[i].charAt(0));
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                bolts[i] = (inputLine[i].charAt(0));
            }

            new Solution().matchPairs(nuts, bolts, n);
            for (int i = 0; i < n; i++) {
                System.out.print(nuts[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.print(bolts[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    void matchPairs(char nuts[], char bolts[], int n) {
      
      quickSort(nuts,bolts,0,n-1); 
    }
    
    void quickSort(char[] nuts,char[] bolts,int l,int h){
        
        if(l<h){
            int pivot= partition(nuts,l,h,nuts[h]);
            
            partition(bolts,l,h,nuts[pivot]);
            
            quickSort(nuts,bolts,l,pivot-1);
            quickSort(nuts,bolts,pivot+1,h);
        }
    }
    
    int partition(char[]  arr, int l,int h,char pivot){
        
        int i=l;
        char temp;
        for(int j=l;j<h;j++){
            
            if(arr[j]<pivot){
               
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                 i++;
            }
            if(arr[j]==pivot){
                temp=arr[j];
                arr[j]=arr[h];
                arr[h]=temp; 
                j--;
            }
        }
          temp = arr[i];
        arr[i] = arr[h];
        arr[h] = temp;
        return i;
    }
}