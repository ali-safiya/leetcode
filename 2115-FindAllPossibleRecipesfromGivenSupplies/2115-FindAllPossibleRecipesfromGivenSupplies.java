// Last updated: 07/03/2026, 03:47:07
1class Solution {
2    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
3
4        HashMap<String, List<String>> graph = new HashMap<>();
5        HashMap<String,Integer> indegree = new HashMap<>();
6
7        for(String recipe:recipes){
8            indegree.put(recipe,0);
9        }
10
11        for(int i=0;i<recipes.length;i++){
12            for(String ing : ingredients.get(i)){
13                graph.computeIfAbsent(ing, k-> new ArrayList<>()).add(recipes[i]);
14                indegree.put(recipes[i],indegree.get(recipes[i])+1);
15            }
16        }
17
18        Queue<String> q = new ArrayDeque<>();
19
20        for(String supply: supplies){
21            q.add(supply);
22        }
23        List<String> ans = new ArrayList<>();
24        
25        while(!q.isEmpty()){
26
27            String cur = q.poll();
28
29            if(!graph.containsKey(cur)) continue;
30
31            for(String rec: graph.get(cur)){
32                indegree.put(rec,indegree.get(rec)-1);
33                if(indegree.get(rec)==0){
34                    ans.add(rec);
35                    q.add(rec);
36                }
37            }
38        }
39        return ans;
40    }
41}