// Last updated: 05/03/2026, 02:54:56
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3        
4        int n = isConnected.length;
5
6        boolean[] visited = new boolean[n];
7        int provinces=0;
8        for(int i=0;i<n;i++){
9            if(!visited[i]){
10                dfs(isConnected,i,visited,n);
11                provinces++;
12            }
13        } 
14        return provinces;
15    }
16
17    private void dfs(int[][] isConnected, int i, boolean[] visited, int n){
18        if(i> n || visited[i]) return;
19
20        visited[i] = true;
21
22        for(int j =0;j<n ;j++){
23            if(isConnected[i][j] ==1){
24                dfs(isConnected,j,visited,n);
25            }
26        }
27
28    }
29}