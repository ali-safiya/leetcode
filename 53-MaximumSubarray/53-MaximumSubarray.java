// Last updated: 02/08/2025, 20:11:19
class Solution {
    public int maxSubArray(int[] nums) {

        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;

        for(int i=0;i<nums.length;i++){

            curSum += nums[i];
            if(curSum < nums[i]){
                curSum= nums[i];
            }
            maxSum=Math.max(maxSum,curSum);
        }

        return maxSum;
        
    }
}