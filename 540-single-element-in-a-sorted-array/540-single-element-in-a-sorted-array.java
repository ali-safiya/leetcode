class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int result=search(nums);
        return result;
        
    }
    
    int search(int[] nums){
        
        
        int low=0;
        int high=nums.length-1;
        int index=-1;
        
        while(low<=high){
            
            int mid=(low+high)/2;
            
        if ((mid == 0 && nums[mid] < nums[mid+1]) ||
            (mid == nums.length-1 && nums[mid] > nums[mid-1])) {return nums[mid];}
            
             if(nums[mid]==nums[mid-1] && (mid-low)%2==0  )
                high=mid;
            else if(nums[mid]==nums[mid-1] && (mid-low)%2!=0)
                low=mid+1;
            
            else if(nums[mid]==nums[mid+1] && (high-mid)%2==0)
                low=mid;
           
            else if(nums[mid]==nums[mid+1] && (high-mid)%2!=0)
                high=mid-1;   
            
            else
            return nums[mid];
            
        }
        
        return index;
    }
}