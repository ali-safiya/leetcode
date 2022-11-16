class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int l=0;
        int h= nums.length-1;
        int res=0;
        while(l<=h){
            int mid = l+ (h-l)/2;
            
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid] < target){
                res=mid+1;
                l=mid+1; 
            }
            else{
                h=mid-1;
            }
        }
        return res;
    }
}