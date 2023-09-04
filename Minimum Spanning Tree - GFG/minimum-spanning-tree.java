//{ Driver Code Starts


import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
	static BufferedReader br;
	static PrintWriter ot;
    public static void main(String args[]) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		ot = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0){
			String s[] = br.readLine().trim().split(" ");
			int V = Integer.parseInt(s[0]);
			int E = Integer.parseInt(s[1]);
			int edges[][] = new int[E][3];
			for(int i = 0; i < E; i++){
				s = br.readLine().trim().split(" ");
				edges[i][0] = Integer.parseInt(s[0]);
				edges[i][1] = Integer.parseInt(s[1]);
				edges[i][2] = Integer.parseInt(s[2]);
			}
			ot.println(new Solution().spanningTree(V, E, edges));
		}
		ot.close();
	}
}
// } Driver Code Ends


// User function Template for Java

class Solution{
	static int spanningTree(int V, int E, int edges[][]){
	    // Code Here. 
	    
	    ArrayList<ArrayList<int[]>> adj = new ArrayList<ArrayList<int[]>>();
	    
	    for(int i=0;i<V;i++){
	        adj.add(new ArrayList<int[]>());
	    }
	    
	    for(int i=0;i<E ; i++){
	        
	        adj.get(edges[i][0]).add(new int[]{edges[i][1],edges[i][2]});
	        adj.get(edges[i][1]).add(new int[]{edges[i][0],edges[i][2]});
	    }
	    
	    
	    PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1]-b[1]);
	    
	    boolean[] visited = new boolean[V];
	    
	    int mst=0;
	    
	    pq.add(new int[]{0,0});
	    
	    while(!pq.isEmpty()){
	        
	        
	        int[] cur = pq.poll();
	        
	        int node = cur[0];
	        int nodeWeight = cur[1];
	        
	        if(visited[node])
	            continue;
	            
	        visited[node]=true;
	        mst+=nodeWeight;
	        
	        for( int[] next : adj.get(node)){
	            
	            int adjNode = next[0];
	            
	            if(!visited[adjNode]){
	                pq.add(next);
	            }
	        }
	    }
	    return mst;
	}
}














