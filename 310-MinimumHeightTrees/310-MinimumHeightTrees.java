// Last updated: 09/03/2026, 02:22:21
1class Solution {
2    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
3
4        if(n == 1) return Arrays.asList(0);
5        
6        List<List<Integer>> adjList = new ArrayList<>();
7        for(int i=0;i<n;i++){
8            adjList.add(new ArrayList<>());
9        }
10        int[] indegree = new int[n];
11
12        for(int[] edge : edges){
13            int u = edge[0];
14            int v = edge[1];
15            adjList.get(u).add(v);
16            adjList.get(v).add(u);
17            indegree[u]++;
18            indegree[v]++;
19        }
20        Queue<Integer> q = new ArrayDeque<>();
21
22        for(int i=0;i<n;i++){
23            if(indegree[i]==1) q.add(i);
24        }
25        int remaining = n;
26        while(remaining > 2){
27
28            int size = q.size();
29            remaining -= size;
30
31            for(int i=0;i<size;i++){
32
33                int cur = q.poll();
34
35                for(int child: adjList.get(cur)){
36                    indegree[child]--;
37                    if(indegree[child]==1)
38                        q.add(child);
39                }
40
41            }
42            
43        }
44
45        return new ArrayList<>(q);
46    }
47}