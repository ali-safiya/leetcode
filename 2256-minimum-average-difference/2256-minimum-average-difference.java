class Solution {
    public int minimumAverageDifference(int[] nums) {
        
        int n = nums.length;
        
        long totalSum = 0;
      
        for(int i=0;i<n;i++){
           totalSum+=nums[i];
        }
        
        long curSum=0;
        int ans=Integer.MAX_VALUE;
        int minAvg=Integer.MAX_VALUE;
        
        for(int i =0;i<n;i++){
            
            curSum+=nums[i];
            long leftAvg = curSum;
            leftAvg/=(i+1);
            long rightAvg =(totalSum-curSum); 
            if(i!=n-1)
               rightAvg /=(n-i-1);
            
            int temp = (int)Math.abs(rightAvg-leftAvg);
            
            if(temp<minAvg){
                minAvg=temp;
                ans=i;
            }
            if(temp==minAvg){
                ans=Math.min(ans,i);
            }
        }
        return ans;
        
    }
}