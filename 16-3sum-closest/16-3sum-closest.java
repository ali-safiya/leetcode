class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int n=nums.length;
        
        int nearestSum=Integer.MAX_VALUE;
        
        for(int i=0;i<n-2;i++){
            
            int low=i+1;
            int high = n-1;
            
            while(low<high){
                
                int sum = nums[i]+ nums[low]+ nums[high];
                
                if(Math.abs(nearestSum- target) > Math.abs(sum- target)){
                    nearestSum= sum;
                }
                
                if(sum < target){
                    low++;
                }
                else if(sum > target ){
                    high--;
                }
                else{
                    return sum;
                }
                
            }
        }
        
        return nearestSum;
        
    }
}