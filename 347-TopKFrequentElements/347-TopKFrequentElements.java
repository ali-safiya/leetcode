// Last updated: 22/02/2026, 04:17:08
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3
4        PriorityQueue<int[]> topKele = new PriorityQueue<>((a,b) -> Integer.compare(a[1],b[1]));
5
6        HashMap<Integer,Integer> freq = new HashMap<>();
7
8        for(int num:nums){
9            freq.put(num,freq.getOrDefault(num,0)+1);
10        }
11
12        for(int key: freq.keySet()){
13            topKele.add(new int[]{key,freq.get(key)});
14
15            if(topKele.size()> k){
16                topKele.poll();
17            }
18        }
19
20        int[] results = new int[k];
21        int i=0;
22        while(!topKele.isEmpty()){
23            results[i++]= topKele.poll()[0];
24        }
25        return results;
26    }
27}