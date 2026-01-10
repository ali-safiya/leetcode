// Last updated: 11/01/2026, 00:38:58
1class Solution {
2    public int maxSubArray(int[] nums) {
3
4        int sum =0;
5        int maxSum = Integer.MIN_VALUE;
6
7        for(int i=0;i<nums.length;i++){
8            if(sum + nums[i] < nums[i]){
9                sum = nums[i];
10            }
11            else{
12                sum+= nums[i];
13            }
14            maxSum = Math.max(maxSum, sum);
15        }
16        return maxSum;
17    }
18}