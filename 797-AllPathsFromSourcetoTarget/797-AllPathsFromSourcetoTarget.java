// Last updated: 09/03/2026, 03:07:43
1class Solution {
2    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
3
4        List<List<Integer>> paths = new ArrayList<>();
5        List<Integer> temp = new ArrayList<>();
6        temp.add(0);
7        dfs(0,graph,paths,temp);
8        return paths;
9    }
10
11    private void dfs(int src, int[][] graph,List<List<Integer>> paths,List<Integer> temp){
12
13        if(src== graph.length-1){
14            paths.add(new ArrayList<>(temp));
15            return;
16        }
17
18        for(int i=0;i<graph[src].length;i++){
19            temp.add(graph[src][i]);
20            dfs(graph[src][i],graph,paths,temp);
21            temp.remove(temp.size()-1);
22        }
23    }
24}