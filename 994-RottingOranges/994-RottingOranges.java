// Last updated: 03/08/2026, 19:34:55
1class Solution {
2    public int[][] highestPeak(int[][] isWater) {
3        
4        int row = isWater.length;
5        int col = isWater[0].length;
6        int[][] dir = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
7
8        int[][] height = new int[row][col];
9
10        Queue<int[]> q = new LinkedList<>();
11
12        for(int i=0;i<row;i++){
13            for(int j=0;j<col;j++){
14                if(isWater[i][j] == 1){
15                    height[i][j] =0;
16                    q.add(new int[]{i,j});
17                }
18                else{
19                    height[i][j] = -1;
20                }
21            }
22        }
23
24        while(!q.isEmpty()){
25
26            int size = q.size();
27
28            while(size-- > 0){
29
30                int[] cur = q.poll();
31
32                for(int i=0;i<dir.length;i++){
33
34                    int x = cur[0] + dir[i][0];
35                    int y = cur[1] + dir[i][1];
36
37                    if(x < 0 || y < 0 || x >= row || y >= col || isWater[x][y]==1)
38                        continue;
39                    
40                    height[x][y] = height[cur[0]][cur[1]]+1;
41                    isWater[x][y] = 1;
42                    q.add(new int[]{x,y});
43                } 
44            }
45        }
46        return height;
47    }
48}