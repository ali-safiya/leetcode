//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

class GfG {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            
            //size of array
            int n = Integer.parseInt(inputLine[0]);
            Job[] arr = new Job[n];
            inputLine = br.readLine().trim().split(" ");
            
            //adding id, deadline, profit
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            
            Solution ob = new Solution();
            
            //function call
            int[] res = ob.JobScheduling(arr, n);
            System.out.println (res[0] + " " + res[1]);
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        
        int[] jobs = new int[n];
        Arrays.fill(jobs,-1);
        
        int[] maxProfit=new int[]{0,0};
        
        Arrays.sort(arr,(a,b)-> b.profit-a.profit);
        
        for(int i=0;i<n;i++){
            
            if(canPlace(jobs,arr[i].id-1,arr[i].deadline-1)){
                maxProfit[0]++;
                maxProfit[1]+=arr[i].profit;
            }
        }
        return maxProfit;
    }
    
    boolean canPlace(int[] jobs, int job_i, int deadline){
        
        while(deadline>=0){
            if(jobs[deadline]==-1){
                jobs[deadline]= job_i;
                return true;
            }
            deadline--;
        }
        return false;
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/