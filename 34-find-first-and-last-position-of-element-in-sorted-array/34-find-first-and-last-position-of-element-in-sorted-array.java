class Solution {

    public int[] searchRange(int[] nums, int target) {
        
        
        int positions[] = new int[2];
        
        positions[0]= findFirstIndex(nums,target);
        positions[1]= findLastIndex(nums,target);
        
        return positions;
    
        
    }
    
    int findFirstIndex(int[] nums, int target){
        
        int index=-1;
        
        int first=0;
        int last=nums.length-1;
        
        while(first<=last){
            
            int mid=(first+last)/2;
            
            if(nums[mid]>= target)
                last=mid-1;
            
            else
                first=mid+1;
            
            if(nums[mid]==target)
                index=mid;
            
        }
        
        
        return index;
    }
    
        int findLastIndex(int[] nums, int target){
        
        int index=-1;
        
        int first=0;
        int last=nums.length-1;
        
        while(first<=last){
            
            int mid=(first+last)/2;
            
            if(nums[mid]<= target)
                 first=mid+1;
            
            else
                 last=mid-1;
            
            if(nums[mid]==target)
                index=mid;
            
        }
        
        
        return index;
    }
    
    
    
}