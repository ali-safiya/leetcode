//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Gfg
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            // arraylist of arraylist to represent graph
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            int V = Integer.parseInt(sc.next());
            int E = Integer.parseInt(sc.next());
            
            for(int i =0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
                
            for(int i = 1; i <= E; i++)
            {    int u = Integer.parseInt(sc.next());
                 int v = Integer.parseInt(sc.next());
                 
                 // adding directed edgese between 
                 // vertex 'u' and 'v'
                 adj.get(u).add(v);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.kosaraju(V, adj));
		}
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to find number of strongly connected components in the graph.
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {
        //code here
        
        boolean[] visited = new boolean[V];
        Stack<Integer> st = new Stack<Integer>();
        
        for(int i=0;i<V;i++){
            
            if(!visited[i]){
                DFS(st,visited,adj,i);
            }
        }
        
        ArrayList<ArrayList<Integer>> reversedEdge = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i<V;i++){
            
            reversedEdge.add(new ArrayList<Integer>());
        }
        
        for(int i=0;i<V;i++){
            
            for(int adjNode : adj.get(i)){
                reversedEdge.get(adjNode).add(i);
            }
        }
        
        Arrays.fill(visited,false);
        int noOfComp=0;
        while(!st.isEmpty()){
            
            int cur = st.pop();
            
            if(!visited[cur]){
                noOfComp++;
                DFS2(reversedEdge,cur,visited);
            }
        }
        return noOfComp;
    }
    
    void DFS2(ArrayList<ArrayList<Integer>> adj, int src , boolean[] visited){
        visited[src]=true;
        
        for(int adjNode : adj.get(src)){
            if(!visited[adjNode]){
                DFS2(adj,adjNode,visited);
            }
        }
    }
    
    void DFS(Stack<Integer> st,boolean[] visited, ArrayList<ArrayList<Integer>> adj , int src ){
        
        visited[src]= true;
        
        for(int adjNode : adj.get(src)){
            
            if(!visited[adjNode]){
                DFS(st,visited,adj,adjNode);
            }
        }
        st.push(src);
    }
}
