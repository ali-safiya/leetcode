// Last updated: 06/03/2026, 03:13:00
1class Solution {
2    public int[] findRedundantConnection(int[][] edges) {
3
4        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
5        int n = edges.length;
6
7        for(int i=0;i<=n;i++){
8            adjList.add(new ArrayList<>());
9        }
10
11        for(int[] edge : edges){
12            int u = edge[0];
13            int v = edge[1];
14            boolean[] visited = new boolean[n+1];
15            if(pathExists(u,v,adjList,visited)){
16                return edge;
17            }
18            adjList.get(u).add(v);
19            adjList.get(v).add(u);
20        }
21        return new int[]{-1,-1};
22    }
23    private boolean pathExists(int src, int target, ArrayList<ArrayList<Integer>> adjList, boolean[] visited){
24
25        if(src == target) return true;
26        if(visited[src]) return false;
27
28        visited[src] =true;
29
30        for(int child : adjList.get(src)){
31            if(pathExists(child, target,adjList,visited)) return true;
32        }
33        return false;
34    }
35}