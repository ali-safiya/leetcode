// Last updated: 17/11/2026, 08:47:59
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3
4        PriorityQueue<Integer> pq = new PriorityQueue<>();
5
6        for(int i=0;i<nums.length;i++){
7
8            if(pq.size() < k){
9                pq.add(nums[i]);
10            }
11            else if(nums[i] > pq.peek()){
12                pq.poll();
13                pq.add(nums[i]);
14            }
15
16
17        }
18        return pq.peek();
19    }
20
21}