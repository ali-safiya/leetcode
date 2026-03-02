// Last updated: 03/03/2026, 03:23:01
1class Solution {
2    public int orangesRotting(int[][] grid) {
3
4        Queue<Pair<Integer,Integer>> q = new ArrayDeque<>();
5
6        int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
7
8        int m = grid.length;
9        int n = grid[0].length;
10
11        int freshCount =0;
12
13        for(int i=0;i<m;i++){
14            for(int j=0;j<n;j++){
15                if(grid[i][j] == 2){
16                    q.add(new Pair<>(i,j));
17                }
18                if(grid[i][j]==1){
19                    freshCount++;
20                }
21            }
22        }
23        int totalTime =0;
24        while(!q.isEmpty() && freshCount>0){
25            
26            int size = q.size();
27
28            for(int i =0;i<size;i++){
29                Pair<Integer,Integer> cur = q.poll();
30
31                for(int j=0;j<4;j++){
32
33                    int x = cur.getKey() + dirs[j][0];
34                    int y = cur.getValue() + dirs[j][1];
35
36                    if(x<0 || y <0 || x >=m || y >=n || grid[x][y] !=1) continue;
37                    
38                    grid[x][y] = 2;
39                    freshCount--;
40                    q.add(new Pair<>(x,y));
41                }
42                
43            }
44            totalTime++;
45        }
46        return freshCount == 0? totalTime : -1 ;
47    }
48}