class Solution {
    public int maxProduct(int[] nums) {
        
        int max_ind =0;
        int secMax=0;
        
        int max=0;
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]>=max) {
                max=nums[i];
                max_ind = i;
            }
                
            
        }
      
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]>=secMax && i!=max_ind){
                secMax=nums[i];
            }
        }
        return (max-1)*(secMax-1);
    }
}