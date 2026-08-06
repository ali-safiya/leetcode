// Last updated: 06/08/2026, 23:10:52
1class Pair{
2    int node;
3    int weight;
4    Pair(int node, int weight){
5        this.node= node;
6        this.weight = weight;
7    }
8}
9class Solution {
10    int minReachable= Integer.MAX_VALUE;
11    int ans=-1;
12    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
13
14        List<List<Pair>> adjList = new ArrayList<>();
15        for(int i=0;i<n;i++){
16            adjList.add(new ArrayList<>());
17        }
18        for(int i=0;i<edges.length;i++){
19            adjList.get(edges[i][0]).add(new Pair(edges[i][1],edges[i][2]));
20            adjList.get(edges[i][1]).add(new Pair(edges[i][0],edges[i][2]));
21        }
22        for (int source = 0; source < n; source++) {
23            runDijkstra(adjList,source,n,distanceThreshold);
24        }
25      
26        return ans;
27    }
28
29    private void runDijkstra(List<List<Pair>> adjList,int source,int n, int distanceThreshold){
30
31        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.weight-b.weight);
32        int[] dist = new int[n];
33        Arrays.fill(dist,Integer.MAX_VALUE);
34        pq.add(new Pair(source,0));
35        dist[source]=0;
36
37        while(!pq.isEmpty()){
38
39            Pair curEdge = pq.poll();
40            int curNode = curEdge.node;
41            int curDist = curEdge.weight;
42
43            if(curDist > dist[curNode]) continue;
44
45            for(Pair child: adjList.get(curNode)){
46
47                if(curDist + child.weight < dist[child.node]){
48                    dist[child.node] = curDist + child.weight;
49                    pq.add(new Pair(child.node, curDist + child.weight));
50                }
51            }
52        }
53        int count = 0;
54
55        for (int i = 0; i < n; i++) {
56
57            if (i != source && dist[i] <= distanceThreshold)
58                count++;
59        }
60        if(count <= minReachable){
61            minReachable=count;
62            ans= source;
63        }
64    }
65}