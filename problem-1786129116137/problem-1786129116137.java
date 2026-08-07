// Last updated: 08/08/2026, 00:28:36
1class Solution {
2    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
3
4        long[] dist = new long[n];
5        Arrays.fill(dist,Long.MAX_VALUE);
6
7        dist[src] = 0;
8        for(int j=0;j<k+1;j++){
9
10            long[] previous = dist.clone();
11            for(int i=0;i<flights.length;i++){
12
13                int u= flights[i][0];
14                int v = flights[i][1];
15                int price = flights[i][2];
16
17                if(previous[u] != Long.MAX_VALUE && previous[u] + price < dist[v]){
18                    dist[v] = previous[u] + price;
19                }
20            
21            }
22        }
23        return dist[dst] == Long.MAX_VALUE ? -1 : (int) dist[dst];
24    }
25}