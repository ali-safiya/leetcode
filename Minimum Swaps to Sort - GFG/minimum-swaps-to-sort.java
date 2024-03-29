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
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minSwaps(nums);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends




class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        // Code here
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int n= nums.length;
        for(int i =0;i<n;i++){
            map.put(nums[i],i);
        }
        Arrays.sort(nums);
        
        boolean[] visited = new boolean[n];
        int ans=0;
        for(int i=0;i<n;i++){
            
            if(visited[i] || map.get(nums[i])==i)
                continue;
            int j=i;
            int noOfCycles=0;
            while(!visited[j]){
                
                visited[j]=true;
                noOfCycles++;
                
                j= map.get(nums[j]);
            }
            ans+= noOfCycles-1;
        }
        return ans;
    }
}