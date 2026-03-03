// Last updated: 04/03/2026, 03:52:13
1class Solution {
2    public boolean validPath(int n, int[][] edges, int source, int destination) {
3
4        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
5
6        for(int i=0;i<n;i++){
7            adjList.add(new ArrayList<>());
8        }
9
10        for(int[] edge : edges){
11
12            adjList.get(edge[0]).add(edge[1]);
13            adjList.get(edge[1]).add(edge[0]);
14        }
15        
16        Queue<Integer> q = new ArrayDeque<>();
17        boolean[] seen = new boolean[n];
18
19
20        q.add(source);
21        seen[source] = true;
22
23        while(!q.isEmpty()){
24
25            int size = q.size();
26
27            for(int i=0;i<size;i++){
28                int cur = q.poll();
29                if(cur == destination) return true;
30
31                for(int j=0;j<adjList.get(cur).size();j++){
32                    if(!seen[adjList.get(cur).get(j)]){
33                        q.add(adjList.get(cur).get(j));
34                        seen[adjList.get(cur).get(j)]= true;
35                    }
36                }
37            }
38        }
39        return false;
40    }
41}