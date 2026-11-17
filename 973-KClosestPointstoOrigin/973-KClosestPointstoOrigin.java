// Last updated: 17/11/2026, 09:26:52
1class Solution {
2    public int[][] kClosest(int[][] points, int k) {
3
4        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[0]- a[0]);
5
6        for(int i=0;i<points.length;i++){
7
8            int dist = findDistance(i,points);
9
10            if(pq.size() < k){
11                pq.add(new int[]{dist,i});
12            }
13            else if(pq.peek()[0] > dist){
14                
15                pq.poll();
16                pq.add(new int[]{dist,i});
17
18            }
19        }
20
21        int[][] ans = new int[pq.size()][2];
22        int i =0;
23        while(!pq.isEmpty()){
24            ans[i++]=points[pq.poll()[1]];
25        }
26
27        return ans;
28        
29    }
30
31    private int findDistance(int i, int[][] nums){
32
33        return nums[i][0] * nums[i][0] + nums[i][1]*nums[i][1];
34    }
35}