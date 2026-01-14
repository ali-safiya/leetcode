// Last updated: 14/01/2026, 20:32:24
1class Solution {
2    public boolean check(int[] nums) {
3
4        int inversion =0;
5
6        for(int i=1;i<nums.length;i++){
7
8            if(nums[i-1] > nums[i]){
9                inversion++;
10            }
11
12        }
13
14        if(nums[nums.length-1] > nums[0])
15            inversion++;
16
17        return inversion <= 1 ;
18        
19    }
20}