class Solution {
    public int totalHammingDistance(int[] nums) {
        int res=0;
        
        for(int i=0;i<32;i++){
            
            int zeroes=0;
            int ones=0;
            
            for(int j=0;j<nums.length;j++){
                
                if((nums[j]>>i & 1 )==1)
                    ones++;
                else
                    zeroes++;
            }
            res+= ones * zeroes;
        }
        return res;
    }
}