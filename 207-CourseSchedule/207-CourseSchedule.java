// Last updated: 12/08/2026, 20:08:56
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3
4        int n = numCourses;
5        int[] indegree = new int[n];
6        List<List<Integer>> adjList = new ArrayList<>();
7
8        for(int i=0;i<n;i++){
9            adjList.add(new ArrayList<>());
10        }
11
12        for(int i=0;i<prerequisites.length;i++){
13            int u = prerequisites[i][1];
14            int v = prerequisites[i][0];
15            adjList.get(u).add(v);
16            indegree[v]++;
17        }
18
19        Queue<Integer> q = new LinkedList<>();
20
21        for(int i=0;i<n;i++){
22            if(indegree[i]==0)
23                q.add(i);
24        }
25
26        int count=0;
27        while(!q.isEmpty()){
28
29            int u = q.poll();
30            count++;
31
32            for(int child:adjList.get(u)){
33                indegree[child]--;
34
35                if(indegree[child]==0){
36                    q.add(child);
37                }
38            }
39        }
40        return count==n;
41    }
42
43}