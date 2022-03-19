class Solution {
    public int findPeakElement(int[] nums) {
        
        int result= findPivot(nums);
       
        return result;
        
    }
    
    int findPivot(int[] nums){
        
        int low=0;
        int high=nums.length-1;
        int index=-1;
        
        while(low<high){
            int mid=(low+high)/2;
            
         
            
            if(nums[mid] > nums[mid+1])
                high=mid;
            else
                low=mid+1;
        }
        
        return low;
    }
}