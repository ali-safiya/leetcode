class Solution {
    public int rob(int[] nums) {
       int n =nums.length;
        if(n==1) return nums[0];
        int[] skipLast = new int[n+1];
        int[] skipFirst = new int[n+1];
        
        skipLast[0]=0;
        skipLast[1]=nums[0];
        skipFirst[0]=0;
        skipFirst[1]=0;
       
        
        for(int i=2;i<n+1;i++){
            
            int pick=0;
            int notPick=0;
            
            pick= nums[i-1] + skipLast[i-2];
            notPick = skipLast[i-1];
            
            skipLast[i]= Math.max(pick,notPick);
            
             pick= nums[i-1] + skipFirst[i-2];
            notPick = skipFirst[i-1];
            
            skipFirst[i]= Math.max(pick,notPick);
            
            
        }
        return Math.max(skipFirst[n],skipLast[n-1]);
        
    }
}