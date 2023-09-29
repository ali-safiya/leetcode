//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    sc.nextLine();
		    Solution obj = new Solution();
		    String arr[]=sc.nextLine().split(" ");
		    System.out.println(obj.mostFrequentWord(arr, n));
		    
		}
	}
}

// } Driver Code Ends
//User function Template for Java


class Solution
{
    //Function to find most frequent word in an array of strings.
    
    class TrieNode{
        
        TrieNode[] children;
        int count;
        int lastOccurrence;
        
        TrieNode(){
            children = new TrieNode[26];
            count=0;
            lastOccurrence=-1;
        }
    }
    TrieNode root = new TrieNode();
    public String mostFrequentWord(String arr[],int n)
    {
        // code here
      
        int maxFreq=1;
        int lastOccured=-1;
        String ans ="";
        for(int i=0;i<arr.length;i++){
            
            int[] freq =insert(arr[i],i);
                // System.out.println(freq[0]+ " "+ freq[1] + " "+arr[i]);
             if (freq[0] > maxFreq || (freq[0] == maxFreq && lastOccured < freq[1])) {
              
                ans = arr[i];
                maxFreq = freq[0];
                lastOccured = freq[1];
                // System.out.println(lastOccured+ " "+ arr[i] + " "+ maxFreq);
            }
        }
        return ans;
        
    }
    
    public int[] insert(String str,int wordIndex){
        
        TrieNode cur = root;
        
        for(int i=0;i<str.length();i++){
            
            int index = str.charAt(i)-'a';
            
            if(cur.children[index]==null){
                cur.children[index]=new TrieNode();
            }
            cur= cur.children[index];
        }
         if (cur.count == 0) {
            cur.count = 1;
            cur.lastOccurrence = wordIndex;
        } else {
            cur.count++;
        }
        //  System.out.println(str +" "+cur.count);
        return new int[]{cur.count,cur.lastOccurrence};
    }

}


//{ Driver Code Starts.
// } Driver Code Ends