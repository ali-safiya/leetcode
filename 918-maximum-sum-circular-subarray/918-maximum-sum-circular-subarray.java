class Solution {
    public int maxSubarraySumCircular(int[] nums) {
      int ans1,ans2;
        int sum=0;
        int curSumPos=0;
        int curSumNeg=0;
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            
            curSumPos+=nums[i];
            
            curSumNeg+= (-1*nums[i]);
            
            if(curSumPos>max1)
                max1=curSumPos;
            if(curSumNeg>max2)
                max2=curSumNeg;
            
            if(curSumPos<0)
                curSumPos=0;
            
            if(curSumNeg<0)
                curSumNeg=0;
            
            sum+=(-1*nums[i]);
                
        }
        
        ans1= -1*(sum-max2);
        ans2=max1;
        if(ans1!=0)
            return Math.max(ans1,ans2);
        else
            return ans2;
    }
}