// Last updated: 05/08/2026, 22:46:49
1class Pair{
2    int node;
3    double weight;
4    Pair(int node , double weight){
5        this.node=node;
6        this.weight=weight;
7    }
8}
9class Solution {
10    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
11
12        List<List<Pair>> adjList = new ArrayList<>();
13        double[] prob = new double[n];
14        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a,b) -> Double.compare(b.weight,a.weight));
15
16        for(int i=0;i<n;i++){
17            adjList.add(new ArrayList<Pair>());
18        }
19        for(int i=0;i<edges.length;i++){
20            adjList.get(edges[i][0]).add(new Pair(edges[i][1],succProb[i]));
21            adjList.get(edges[i][1]).add(new Pair(edges[i][0],succProb[i]));
22        }
23
24        pq.add(new Pair(start_node,1.0));
25        prob[start_node]=1.0;
26
27        while(!pq.isEmpty()){
28
29            Pair edge = pq.poll();
30            int dest = edge.node;
31            double curProb = edge.weight;
32
33            if(dest == end_node) return prob[dest];
34
35            if(curProb < prob[dest]) continue;
36
37            for(Pair child : adjList.get(dest)){
38                
39                if(child.weight * prob[dest] > prob[child.node]){
40                    prob[child.node]= child.weight * prob[dest];
41                    pq.add(new Pair(child.node,child.weight * prob[dest]));
42                }
43            }
44        }
45        return 0.0;
46    }
47}