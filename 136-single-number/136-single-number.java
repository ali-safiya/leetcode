class Solution {
    public int singleNumber(int[] nums) {
        
        int xor=0;
        
        for(int elem : nums ){
            xor^=elem ;
        }
        
        
        return xor;
    }
}