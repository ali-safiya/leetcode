// Last updated: 05/08/2026, 19:20:41
1class Pair{
2    int node;
3    int weight;
4    Pair(int node,int weight){
5        this.node=node;
6        this.weight=weight;
7    }
8}
9class Solution {
10    public int networkDelayTime(int[][] times, int n, int k) {
11
12        List<List<Pair>> adjList= new ArrayList<>();
13        int[] dist = new int[n];
14        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.weight - b.weight);
15
16        for(int i=0;i<n;i++){
17                adjList.add(new ArrayList<Pair>());
18                dist[i]=Integer.MAX_VALUE;
19        }
20
21        for(int i=0;i<times.length;i++){
22                adjList.get(times[i][0]-1).add(new Pair(times[i][1]-1,times[i][2]));
23        }
24
25        pq.add(new Pair(k-1,0));
26        dist[k-1]=0;
27
28        while(!pq.isEmpty()){
29
30            Pair cur = pq.poll();
31
32            int v = cur.node;
33            int w = cur.weight;
34
35            if(dist[v] < w) continue;
36
37            for(Pair p : adjList.get(v)){
38
39                if(w + p.weight < dist[p.node]){
40                    dist[p.node]= w + p.weight;
41                    pq.add(new Pair(p.node,dist[p.node]));
42                }
43            }
44        }
45        int maxTime=-1;
46        for(int i=0;i<n;i++){
47           if(dist[i]==Integer.MAX_VALUE) return -1;
48            maxTime= Math.max(dist[i],maxTime);       
49        }
50        return maxTime;
51    }
52}