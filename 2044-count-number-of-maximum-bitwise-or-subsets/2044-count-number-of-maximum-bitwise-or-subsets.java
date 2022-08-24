class Solution {
    public int countMaxOrSubsets(int[] nums) {
        
        int orSum =0;
        for(int val:nums){
            orSum|=val;
        }
        
        return findSubsets(nums,0,0,orSum);
        
    }
    int findSubsets(int[] nums, int ind , int orSum, int target){
        if(ind==nums.length  && (orSum==target))
            return 1;
        if(ind>=nums.length)
            return 0;
        
        int take = findSubsets(nums,ind+1, nums[ind]|orSum,target);
        int notTake =findSubsets(nums,ind+1,orSum,target);
        
        return take+notTake;
    }
}