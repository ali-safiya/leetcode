// Last updated: 06/08/2026, 21:12:12
1class Pair{
2    int node;
3    long weight;
4    Pair(int node, long weight){
5        this.node = node;
6        this.weight = weight;
7    }
8}
9class Solution {
10    public int countPaths(int n, int[][] roads) {
11
12        int MOD = 1_000_000_007;
13        List<List<Pair>> adjList = new ArrayList<>();
14        long[] time= new long[n];
15        Arrays.fill(time,Long.MAX_VALUE);
16        long[] ways = new long[n];
17        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a,b) -> Long.compare(a.weight , b.weight));
18
19        for(int i=0;i<n;i++){
20            adjList.add(new ArrayList<>());
21        }
22
23        for(int i=0;i<roads.length;i++){
24            adjList.get(roads[i][0]).add(new Pair(roads[i][1],roads[i][2]));
25            adjList.get(roads[i][1]).add(new Pair(roads[i][0],roads[i][2]));
26        }
27
28        pq.add(new Pair(0,0));
29        time[0]=0;
30        ways[0]=1;
31
32        while(!pq.isEmpty()){
33
34            Pair curEdge = pq.poll();
35            int curNode = curEdge.node;
36            long curTime = curEdge.weight;
37
38            if(curTime > time[curNode]) continue;
39
40            for(Pair child: adjList.get(curNode)){
41
42                if(curTime + child.weight < time[child.node]){
43                    time[child.node] = curTime + child.weight;
44                    ways[child.node] = ways[curNode];
45                    pq.add(new Pair(child.node,time[child.node]));
46                }
47                else if(curTime + child.weight == time[child.node]){
48                    ways[child.node] = (ways[curNode]+ ways[child.node])%MOD ;
49                }
50            }
51        }
52        return (int)(ways[n-1]%MOD);
53    }
54}