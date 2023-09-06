//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for(int i = 0; i < V+1; i++)
                list.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++)
            {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
                list.get(v).add(u);
            }
            int c = sc.nextInt();
            int d = sc.nextInt();
            
            Solution ob = new Solution();
            
            System.out.println(ob.isBridge(V,list,c,d));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution
{
    //Function to find if the given edge is a bridge in graph.
    static int timer=1;
    static int isBridge(int V, ArrayList<ArrayList<Integer>> adj,int c,int d)
    {
        // code here
        int[] ans=new int[]{0};
        boolean[] visited = new boolean[V];
        int[] dist = new int[V];
        int[] low = new int[V];
        
        for(int i=0;i<V;i++){
            if(!visited[i]){
                DFS(adj,visited,dist,low,i,-1,c,d,ans);
            }
        }
        
        return ans[0];
        
    }
    
    static void DFS(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int[] dist, int[] low, int src,int parent,
    int c, int d,int[] ans){
      
      visited[src]=true;
       timer++;
      dist[src] = low[src]= timer;
     
      
      for(int adjNode: adj.get(src)){
          
          if(adjNode==parent)
            continue;
          if(!visited[adjNode]){
              
              DFS(adj,visited,dist,low,adjNode,src,c,d,ans);
              
              low[src]=Math.min(low[src],low[adjNode]);
              
              if(low[adjNode]>dist[src] && ((adjNode==d && src==c) || (adjNode==c && src==d) )){
                  ans[0] =1;
              }
          }
          else{
              low[src]=Math.min(low[src],low[adjNode]);
          }
      }
    }
}