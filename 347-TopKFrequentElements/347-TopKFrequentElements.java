// Last updated: 17/11/2026, 09:43:51
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3
4        HashMap<Integer,Integer> freq = new HashMap<>();
5
6        for(int num: nums){
7            freq.put(num,freq.getOrDefault(num,0)+1);
8        }
9
10        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> (a[0]-b[0]));
11
12        for(Map.Entry<Integer,Integer> entry: freq.entrySet()){
13
14            int num = entry.getKey();
15            int curfreq = entry.getValue();
16
17            if(pq.size() < k){
18                pq.add(new int[]{curfreq,num});
19            }
20            else if(pq.peek()[0] < curfreq){
21                pq.poll();
22                pq.add(new int[]{curfreq,num});
23            }
24        }
25
26        int[] ans = new int[pq.size()];
27        int i=0;
28        while(!pq.isEmpty()){
29            ans[i++]=pq.poll()[1];
30        }
31        return ans;
32    }
33}