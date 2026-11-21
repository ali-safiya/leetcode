// Last updated: 21/11/2026, 10:50:45
1class Solution {
2    public List<List<Integer>> getAncestors(int n, int[][] edges) {
3
4        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
5        List<List<Integer>> ans = new ArrayList<>();
6
7        for(int i=0;i<n;i++){
8            graph.add(new ArrayList<>());
9        }
10        for(int i=0;i<n;i++){
11            ans.add(new ArrayList<>());
12        }
13
14        for(int i=0;i<edges.length;i++){
15            graph.get(edges[i][0]).add(edges[i][1]);
16        }
17        
18        for(int i=0;i<n;i++){
19            boolean[] visited = new boolean[n];
20            dfs(graph,n,ans,visited,i,i);
21        }
22        return ans;
23    }
24
25    private void dfs(ArrayList<ArrayList<Integer>> graph, int n, List<List<Integer>> ans,boolean[] visited,int u,int source){
26
27            if(visited[u]) return;
28
29            visited[u]=true;
30            for(int v : graph.get(u)){
31                if(!visited[v]){
32                    ans.get(v).add(source);
33                    dfs(graph,n,ans,visited,v,source);
34                }  
35            }
36
37
38    }
39}