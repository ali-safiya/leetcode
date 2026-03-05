// Last updated: 06/03/2026, 03:45:51
1class Solution {
2    public List<Integer> eventualSafeNodes(int[][] graph) {
3        
4        int n = graph.length;
5        int[] state = new int[n];
6        List<Integer> res = new ArrayList<>();
7
8        for(int i=0;i<n;i++){
9            if(dfs(graph, i, state)){
10                res.add(i);
11            }
12        }
13        return res;
14    }
15
16    private boolean dfs(int[][] graph , int i, int[] state){
17
18        if(state[i]!=0){
19            return state[i]==2;
20        }
21
22        state[i] =1;
23        for(int j=0;j<graph[i].length;j++){
24            if(!dfs(graph,graph[i][j],state)) return false;
25        }
26
27        state[i] = 2;
28        return true;
29    }
30}