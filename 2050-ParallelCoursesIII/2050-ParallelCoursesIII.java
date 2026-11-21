// Last updated: 21/11/2026, 11:31:44
1class Solution {
2    public int minimumTime(int n, int[][] relations, int[] time) {
3
4        int[] indegree = new int[n];
5        int[] completionTime = new int[n];
6
7        List<List<Integer>> adjList = new ArrayList<>();
8
9        for(int i=0;i<relations.length;i++){
10            indegree[relations[i][1]-1]++;
11        }
12
13        for(int i=0;i<n;i++){
14            completionTime[i] = time[i];
15            adjList.add(new ArrayList<>());
16        }
17
18        for(int i=0;i<relations.length;i++){
19            int u = relations[i][0]-1;
20            int v = relations[i][1]-1;
21            adjList.get(u).add(v);
22        }
23
24        Queue<Integer> q = new LinkedList<>();
25
26        for(int i=0;i<n;i++){
27            if(indegree[i] == 0){
28                q.add(i);
29            }
30        }
31
32        while(!q.isEmpty()){
33
34            int size = q.size();           
35
36            for(int i=0;i<size;i++){
37
38                int u = q.poll();
39
40                for(int v : adjList.get(u)){
41                    completionTime[v] = Math.max(completionTime[v],completionTime[u] +time[v]);
42                    indegree[v]--;
43                    if(indegree[v] == 0){
44                        q.add(v);
45                    }
46                }
47            }
48        }
49        int ans =0;
50        for(int i=0;i<n;i++){
51            ans = Math.max(ans,completionTime[i]);
52        }
53        return ans;
54    }
55}