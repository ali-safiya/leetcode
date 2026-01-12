// Last updated: 13/01/2026, 00:22:31
1class Solution {
2    public int[][] merge(int[][] intervals) {
3
4        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
5
6        LinkedList<int[]> ans = new LinkedList<>();
7
8        for(int i =0 ;i<intervals.length;i++){
9
10            if(ans.isEmpty() || ans.getLast()[1] < intervals[i][0]){
11                ans.add(intervals[i]);
12            }
13            else{
14                ans.getLast()[1] = Math.max(ans.getLast()[1], intervals[i][1]);
15            }
16        }
17
18        return ans.toArray(new int[ans.size()][]);
19    }
20}