// Last updated: 12/08/2026, 19:13:52
1class Solution {
2
3    public int minCostConnectPoints(int[][] points) {
4        int n = points.length;
5        boolean[] visited = new boolean[n];
6        int minCost=0;
7
8        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[1],b[1]));
9
10        pq.add(new int[]{0,0});
11        int count=0;
12
13        while(!pq.isEmpty() && count <n){
14
15            int[] cur = pq.poll();
16            int u = cur[0];
17            int v = cur[1];
18
19            if(visited[u]) continue;
20            visited[u] = true;
21            minCost+=v;
22            count++;
23
24            for(int i=0;i<n;i++){
25                if(!visited[i])
26                    pq.add(new int[]{i,manhattanDistance(u,i,points)});
27            }
28        }
29        return minCost;
30    }
31     private int manhattanDistance(int u, int v,int[][] points){
32        return Math.abs(points[u][0] - points[v][0]) + Math.abs(points[u][1] - points[v][1]);
33     }
34
35}