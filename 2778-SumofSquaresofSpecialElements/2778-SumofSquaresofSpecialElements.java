// Last updated: 12/10/2026, 02:20:42
1class Solution {
2    public int sumOfSquares(int[] nums) {
3
4        int sum =0;
5        int n= nums.length;
6
7        for(int i=0;i<n;i++){
8            if(n % (i+1) == 0){
9                // System.out.println(nums[i]);
10                sum += nums[i]*nums[i];
11            }
12        }
13        return sum;
14    }
15}