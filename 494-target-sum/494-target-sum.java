class Solution {
    int count=0;
    public int findTargetSumWays(int[] nums, int target) {
       
        
        findCombination(nums,target,0,0);
        return count;
    }
    
    void findCombination(int[] nums,int target,int index,int sum){
        
        if(index==nums.length){
            if( sum==target){
               
            count=count+1;
            }
           
        }
        else{
        findCombination(nums,target,index+1,sum+nums[index]);
        findCombination(nums,target,index+1,sum-nums[index]);
        }
    
        
    }
}