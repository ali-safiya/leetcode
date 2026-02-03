// Last updated: 03/02/2026, 17:50:04
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3
4        int maxOnes = 0;
5
6        boolean isOne  = false;
7        int count =0;
8        for(int i =0;i<nums.length;i++){
9
10            if(nums[i]==1){
11                isOne = true;
12                count++;
13            }else{
14                isOne = false;
15                count=0;
16            }
17            maxOnes = Math.max(count, maxOnes);
18        }
19        return maxOnes;       
20    }
21}