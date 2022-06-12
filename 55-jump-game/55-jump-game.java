class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int[] jumps = new int[n];
        if(n==1)
            return true ;
        jumps[0]=nums[0];
        
        
        
        for(int i=1;i<n;i++){
            if(jumps[i-1]<1)
                return false;
            jumps[i]= Math.max(jumps[i-1]-1,nums[i]);
          }
     
        return true;
    }
}