class Solution {
    public int search(int[] nums, int target) {
        
        int pivot=findPivot(nums);
        System.out.println(pivot);
        int result=-1;
        if(pivot==-1)
            return findTarget(nums,target,0,nums.length-1);
        if(target>=nums[0])
            result=findTarget(nums,target,0,pivot-1);
        else 
            result = findTarget(nums,target,pivot,nums.length-1);
        
        return result;
        
    }
    
    int findPivot(int[] nums){
        
        int first=0;
        int last=nums.length -1;
        int index=-1;
        
        while(first<=last){
            
            int mid=first+(last-first)/2;
            
            
            if(first<mid && nums[mid]<nums[mid-1])
                index=mid;
            
             
            if(last>mid && nums[mid]>nums[mid+1])
                index=mid+1;
            
            
            
            if(nums[mid]>nums[0])
                first=mid+1;
            else
                last=mid-1;
    
        }
        return index;
    }
    
    int findTarget(int nums[], int target,int first,int last){
        
     
        
        int index=-1;
        
        while(first<=last){
            
            int mid=(first+last)/2;
            
       
            
            if(nums[mid]>target ){
                
                last=mid-1;
                
            }
            
            else if(nums[mid]<target){
                
                first=mid+1;
            }
            
            else {
                return mid;
            }
            
            
            
        }
        return index;
    }
}