// Last updated: 04/03/2026, 02:22:33
1class Solution {
2    public int[][] updateMatrix(int[][] mat) {
3        
4        int m = mat.length;
5        int n = mat[0].length;
6
7        int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
8
9        Queue<int[]> q = new ArrayDeque<>();
10
11        for(int i=0;i<m;i++){
12            for(int j=0;j<n;j++){
13                if(mat[i][j] == 0){
14                    q.add(new int[]{i,j});
15                }
16                else{
17                    mat[i][j] = -1;
18                }
19            }
20        }
21
22        while(!q.isEmpty()){
23
24            int size = q.size();
25
26            for(int i=0;i<size;i++){
27
28                int[] cur = q.poll();
29
30                for(int j=0;j<4;j++){
31                    int x = cur[0] + dirs[j][0];
32                    int y = cur[1] + dirs[j][1];
33
34                    if(x <0 || y <0 || x >= m || y>=n || mat[x][y]!= -1) continue;
35                    mat[x][y] = mat[cur[0]][cur[1]] +1 ;
36                    q.add(new int[]{x,y});
37
38                }
39            }
40        }
41
42        return mat;
43    }
44}