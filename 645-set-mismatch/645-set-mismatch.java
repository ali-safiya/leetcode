class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int xor=0;
        int xor1=0;
        int xor0=0;
        
        for(int val: nums){
            xor^=val;
        }
        for(int i=1;i<=nums.length;i++){
            xor^=i;
        }
        
        int rmb = xor & ~(xor-1);
        
        for(int val:nums){
            if( (val & rmb) ==0)
                xor0^=val;
            else
                xor1^=val;
        }
        
        for(int i=1;i<=nums.length;i++){
            if( (i & rmb )==0)
                xor0^=i;
            else
                xor1^=i;
        }
        
        for(int val:nums){
            if(xor0 == val)
                return new int[]{xor0,xor1};
        }
        return new int[]{xor1,xor0};
        
    }
}