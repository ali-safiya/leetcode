// Last updated: 11/08/2026, 18:51:23
1class Solution {
2
3    int[] parent;
4    int[] size;
5    int minCost;
6
7    public int minCostConnectPoints(int[][] points) {
8
9        List<int[]> edges = new ArrayList<>();
10        int n = points.length;
11        minCost=0;
12        for(int i=0;i<n;i++){
13
14            int x1 = points[i][0];
15            int y1 = points[i][1];
16
17            for(int j=i+1;j<n;j++){
18
19                int x2 = points[j][0];
20                int y2 = points[j][1];
21                
22                int distance = Math.abs(x1-x2) + Math.abs(y1-y2);
23                edges.add(new int[]{i,j,distance});
24            }
25        }
26
27        edges.sort((a,b) -> a[2] - b[2]);
28        runKrushkal(edges,n);
29        return minCost;
30    }
31
32    private void runKrushkal(List<int[]> edges, int n){
33
34        intializeDSU(n);
35        int selected =0;
36        for(int i=0;i<edges.size();i++){
37
38            int[] edge = edges.get(i);
39            int u= edge[0];
40            int v= edge[1];
41            int distance= edge[2];
42
43            if(find(u) == find(v)) continue;
44
45            union(u,v);
46            selected++;
47            minCost+= distance;
48            if(selected == n-1){
49                break;
50            }
51        }
52    }
53
54    private void intializeDSU(int n){
55        parent=new int[n];
56        size= new int[n];
57        Arrays.fill(size,1);
58        for(int i=0;i<n;i++){
59            parent[i]=i;
60        }
61    }
62
63    private int find(int x){
64        if(parent[x]==x) return x;
65        return parent[x]= find(parent[x]);
66    }
67
68    private void union(int u, int v){
69
70        int x = find(u);
71        int y = find(v);
72
73        if(x==y) return;
74
75        if(size[x] < size[y]){
76            parent[x] = y;
77            size[y]+= size[x];
78        }
79        else{
80            parent[y] = x;
81            size[x]+= size[y];
82        }
83
84    }
85
86}