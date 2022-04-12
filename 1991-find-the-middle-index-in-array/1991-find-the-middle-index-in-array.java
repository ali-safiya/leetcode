class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum=0;
        int leftSum=0;
        
        for(int ele:nums){
            sum+=ele;
        }
        
        for(int i=0;i<nums.length;i++){
            
            sum-=nums[i];
            
            if(sum==leftSum)
                return i;
            leftSum+=nums[i];
        }
         return -1;   
    }
}