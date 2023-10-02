//{ Driver Code Starts
//Initial Template for Java

import java.io.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        
        //using BufferedReader to take input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //taking total testcases
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            
            //taking total number of elements
            int n = Integer.parseInt(br.readLine());
            
            int par[] = new int[n+1];
            int rank[] = new int[n+1];
            
            //initializing the parent and
            //the rank array
            for(int i = 1; i<=n; ++i){
                par[i] = i;
                rank[i] = 1;
            }
            int a = 0, b = 0;
            char c = '0';
            
            //taking number of queries
            int query = Integer.parseInt(br.readLine());
            
            Boolean output = false;
            while(query-- >0){
                String str[] = br.readLine().trim().split(" ");
                c = str[0].charAt(0);
                a = Integer.parseInt(str[1]);
                b = Integer.parseInt(str[2]);

                //if query type is 'U'
                //then calling union_ method
                if(c == 'U'){
                    new Solution().union_(a, b, par, rank);
                }
                else{//else calling isConnected() method
                    output = new Solution().isConnected(a, b, par, rank);
                    if(output == true)
                        System.out.println("1");
                    else
                        System.out.println("0");
                }
            }



        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to merge two nodes a and b.
    public void union_(int a, int b, int par[], int rank[])
    {
        // add your code here
        
        if(isConnected(a,b,par,rank))
            return;
            
        int x_rep = find(a,par);
        int y_rep = find(b,par);
        
            
        if(rank[x_rep] > rank[y_rep]){
            par[y_rep]= x_rep;
        }
        else if(rank[y_rep] > rank[x_rep]){
            par[x_rep] = y_rep;
        }
        else{
            par[x_rep]= y_rep;
            rank[y_rep]++;
        }
            
        
    }

    //Function to check whether 2 nodes are connected or not.
    public Boolean isConnected(int a, int b, int par[], int rank[])
    {
        // add your code here
        
        int x= find(a,par);
        int y= find(b,par);
        
        if(x==y){
            return true;
        }
        return false;
    }
    
    public int find(int x, int[] par){
        
        if(x == par[x]){
            return x;
        }
        
        par[x] = find(par[x],par);
        
        return par[x];
    }

}


