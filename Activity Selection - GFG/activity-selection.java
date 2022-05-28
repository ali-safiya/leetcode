// { Driver Code Starts
import java.io.*; 
import java.util.*; 
import java.lang.*;

class Main
{
    public static void main (String[] args) throws IOException  
    {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//testcases
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t-- > 0)
		{
		    String inputLine[] = br.readLine().trim().split(" ");
		    //size of array
		    int n = Integer.parseInt(inputLine[0]);
		    int start[] = new int[n];
		    int end[] = new int[n];
		    
		    //adding elements to arrays start and end
		    inputLine = br.readLine().trim().split(" ");
		    for(int i = 0; i < n; i++)
		     start[i] = Integer.parseInt(inputLine[i]);
		    
		    inputLine = br.readLine().trim().split(" ");
		    for(int i= 0; i < n; i++)
		      end[i] = Integer.parseInt(inputLine[i]);
		    
		    //function call
		    System.out.println(new Solution().activitySelection(start, end, n));
		}
    }
}

// } Driver Code Ends


class Solution
{
    //Function to find the maximum number of activities that can
    //be performed by a single person.
    public static int activitySelection(int start[], int end[], int n)
    {
        int ans=1;
        Activity[] arr = new Activity[n];
        for(int i=0;i<n;i++){
            arr[i]= new Activity(start[i],end[i]);
        }
        Compare obj= new Compare();
        obj.compare(arr);
        
        int i=0;
        for(int j=1;j<n;j++){
            
            if(arr[j].start>arr[i].finish){
                ans++;
                i=j;
        
            }
        }
        return ans;
    }
}

class Activity{
    int start;
    int finish;
    Activity(int start,int finish){
        this.start = start;
        this.finish = finish;
    }
}

class Compare{
    static void compare(Activity[] arr){
        Arrays.sort(arr, new Comparator<Activity>(){
            
            public int compare(Activity a1 , Activity a2){
                return a1.finish- a2.finish;
            }
        });
    }
}