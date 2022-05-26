class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        
        Arrays.sort(nums);
        
        int n = nums.length;
        int sum=0;
        
        for(int no : nums)
            sum+=no;
            
        
        if(nums[0]>0){
            if(k% 2==0)
                return sum;
            else 
                return sum-(2*nums[0]);
        }else
        {
            int negEleSum =0;
            int min=Integer.MAX_VALUE;
            
            for(int i=0;i<n;i++){
                if(nums[i]<0 && k>0){
                    negEleSum+=Math.abs(nums[i]);
                    min=Math.min(min,Math.abs(nums[i]));
                    k--;
                }
                min=Math.min(min,Math.abs(nums[i]));
            }
            
            if(k%2==0)
                return sum+2*negEleSum;
            else
                return sum+2*negEleSum-2*min;
        }
    }
}