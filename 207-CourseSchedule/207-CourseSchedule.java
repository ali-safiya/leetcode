// Last updated: 05/03/2026, 03:54:32
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3
4        boolean[] visited = new boolean[numCourses];
5        boolean[] pathVisited = new boolean[numCourses];
6
7        List<List<Integer>> adjList= new ArrayList<>();
8
9        for(int i=0;i<numCourses;i++){
10            adjList.add(new ArrayList<>());
11        }
12        
13        for(int i=0;i<prerequisites.length;i++){
14            adjList.get(prerequisites[i][1]).add(prerequisites[i][0]);
15        }
16
17        for(int i=0;i<numCourses;i++){
18            if(!visited[i]){
19                if(dfs(i,visited,pathVisited,adjList)) return false;
20            }
21        }
22        return true;
23    }
24
25    private boolean dfs(int i, boolean[] visited,boolean[] pathVisited, List<List<Integer>> adjList ){
26
27        if(pathVisited[i]) return true;
28        if(visited[i]) return false;
29        visited[i] = true;
30        pathVisited[i] = true;
31
32        for(int child : adjList.get(i)){
33            if(dfs(child,visited,pathVisited,adjList)) return true;
34        }
35        pathVisited[i] = false;
36        return false;
37
38    }
39}