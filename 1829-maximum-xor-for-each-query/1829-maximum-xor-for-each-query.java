class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n=nums.length;
        int max = (int)Math.pow(2,maximumBit)-1;
        int[] ans = new int[nums.length];
        int xor=0;
        
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
            ans[n - i-1]= xor^max;            
        }
        
        return ans;
    }
    
}