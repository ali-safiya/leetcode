// Last updated: 31/07/2026, 23:07:57
1class DSU{
2
3    int parents[];
4    int size[];
5
6    DSU(int n){
7        parents = new int[n];
8        size = new int[n];
9
10        for(int i=0;i<n;i++){
11            parents[i] = i;
12            size[i] = 1;
13        }
14    }
15
16    public int find(int x){
17
18        if(x == parents[x]) return x;
19        return parents[x] = find(parents[x]);
20    }
21
22    public void union(int x, int y){
23
24        int u = find(x);
25        int v = find(y);
26
27        if(u==v) return;
28
29        if(size[u] < size[v]){
30            parents[u] = v;
31            size[v] += size[u];
32        }
33        else{
34            parents[v] = u;
35            size[u] += size[v];
36        }  
37    }
38}
39
40class Solution {
41    public List<List<String>> accountsMerge(List<List<String>> accounts) {
42
43        int n = accounts.size();
44        DSU dsu = new DSU(n);
45
46        HashMap<String, Integer> edges = new HashMap<>();
47
48        for(int i=0;i<n;i++){
49
50            String name = accounts.get(i).get(0);
51            for(int j=1;j<accounts.get(i).size();j++){
52
53                String email = accounts.get(i).get(j); 
54
55                if(edges.containsKey(email)){
56                    dsu.union(i,edges.get(email));
57                }
58                else{
59                    edges.put(email,i);
60                }
61            }
62        }
63
64        Map<Integer, List<String>> components = new HashMap<>();
65
66        for(String emails:  edges.keySet()){
67            int vertex = edges.get(emails);
68            int root = dsu.find(vertex);
69            if(!components.containsKey(root)){
70                components.put(root, new ArrayList<String>());
71            }
72            components.get(root).add(emails);
73        } 
74
75        List<List<String>> ans = new ArrayList<>();
76
77        for(int grp : components.keySet()){
78
79            List<String> comp = components.get(grp);
80            Collections.sort(comp);
81            comp.add(0,accounts.get(grp).get(0));
82            ans.add(comp);
83        }
84
85        return ans;
86        
87    }
88}