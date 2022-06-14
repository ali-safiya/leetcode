class Solution {
    public int getMaxLen(int[] nums) {
      int len=0;
      int maxLen=0;
      int product=1;
      for(int i=0;i<nums.length;i++){
       if(nums[i]>0 && product==1)
           product=1;
          else if(nums[i]<0 && product==-1)
              product=1;
    else if(nums[i]==0 || product==0)
        product=0;
          else
              product=-1;
    len++;
          
        if(product==0)
        {
            len=0;
            product=1;
        }
          if(product>0)
              maxLen=Math.max(maxLen,len);
         // System.out.print(maxLen+ " "+ len +" first");
      }
        len=0;
        product=1;
        for(int i=nums.length-1;i>=0;i--){
        if(nums[i]>0 && product==1)
           product=1;
                else if(nums[i]<0 && product==-1)
              product=1;
    else if(nums[i]==0 || product==0)
        product=0;
          else
              product=-1;
        len++;
         
                if(product==0){
            len=0;
                    product=1;
                }
             if(product>0)
              maxLen=Math.max(maxLen,len);
            // System.out.print(maxLen+ " "+ len +" "+ product+ " "+" sec");
          
      }
        return maxLen;
    }
}