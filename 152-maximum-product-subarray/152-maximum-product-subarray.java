class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;

        int product=1;
        
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            product*=nums[i];
            
            max=Math.max(max,product);
            if(product==0)
                product=1;
        }
        product=1;
         for(int i=n-1;i>=0;i--){
            product*=nums[i];
            
            max=Math.max(max,product);
             if(product==0)
                product=1;
        }
        
        return max;
    }
}