// Last updated: 09/08/2026, 23:21:03
1class Solution {
2    int minReachable= Integer.MAX_VALUE;
3    int ans=-1;
4
5    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
6
7        for(int i=0;i<n;i++){
8
9            runBellManFord(n,edges,distanceThreshold,i);
10
11        }
12        return ans;
13    }
14
15    private void runBellManFord(int n, int[][] edges,int distThreshold, int src){
16
17        int[] dist = new int[n];
18        Arrays.fill(dist,Integer.MAX_VALUE);
19        dist[src] = 0;
20
21        for(int i=0;i<n;i++){
22
23            for(int[] edge :edges){
24
25                int u = edge[0];
26                int v = edge[1];
27                int weight = edge[2];
28
29                if(dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]){
30                    dist[v] = dist[u]+ weight;
31                }
32                if (dist[v] != Integer.MAX_VALUE &&
33                    dist[v] + weight < dist[u]) {
34
35                    dist[u] = dist[v] + weight;
36                }
37            }
38        }
39        int count=0;
40        for(int i=0;i<n;i++){
41            if(dist[i] <= distThreshold){
42                count++;
43            }
44        }
45        if(count <= minReachable){
46            minReachable = count;
47            ans = src;
48        }
49    }
50}