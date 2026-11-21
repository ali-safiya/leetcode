// Last updated: 21/11/2026, 07:54:56
1class Solution {
2    public List<Integer> eventualSafeNodes(int[][] graph) {
3        
4        int n = graph.length;
5        int[] state = new int[n];
6
7        ArrayList<Integer> res = new ArrayList<>();
8
9        for(int i=0;i<n;i++){
10            if(dfs(graph,i,state)){
11                res.add(i);
12            }
13        }
14        return res;
15    }
16
17    private boolean dfs(int[][] graph , int v,int[] state){
18
19        if(state[v] ==1) return false;
20        if(state[v] == 2) return true;
21
22        state[v]= 1;
23        for(int i=0;i<graph[v].length;i++){
24            if(!dfs(graph,graph[v][i],state))
25                return false;
26        }
27
28        state[v]= 2;
29        return true;
30    }
31
32    
33}