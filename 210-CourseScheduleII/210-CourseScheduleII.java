// Last updated: 07/03/2026, 02:32:28
1class Solution {
2    public int[] findOrder(int numCourses, int[][] prerequisites) {
3        ArrayList<Integer> ans = new ArrayList<>();
4
5        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
6
7        for(int i=0;i<numCourses;i++){
8            adjList.add(new ArrayList<>());
9        }
10
11        int[] indegree = new int[numCourses];
12
13        for(int i=0;i<prerequisites.length;i++){
14            int u = prerequisites[i][0];
15            int v = prerequisites[i][1];
16
17            adjList.get(v).add(u);
18            indegree[u]++;
19        }
20
21        Queue<Integer> q = new ArrayDeque<>();
22
23        for(int i=0;i<numCourses;i++){
24            if(indegree[i]==0){
25                q.add(i);
26            }
27        }
28
29        while(!q.isEmpty()){
30
31            int cur = q.poll();
32
33            ans.add(cur);
34
35            for(int child: adjList.get(cur)){
36                indegree[child]--;
37                if(indegree[child]==0) q.add(child);
38                
39            }
40        }
41
42        int[] result = new int[ans.size()];
43
44        for (int i = 0; i < ans.size(); i++) {
45            result[i] = ans.get(i);
46        }
47
48        return result.length==numCourses? result : new int[0];    
49    }
50}