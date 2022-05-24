class Solution {
    public int maximumProduct(int[] nums) {
        
        int min1=Integer.MAX_VALUE, min2=Integer.MAX_VALUE;
        int max1=Integer.MIN_VALUE, max2=Integer.MIN_VALUE, max3=Integer.MIN_VALUE;
        
        
        for(int ele : nums){
            
            if(ele <=min1){
                min2=min1;
                min1=ele;
            }else if(ele <=min2){
                min2=ele;
            }
            
            if(ele>=max1){
                max3=max2;
                max2=max1;
                max1=ele;
            }else if(ele >= max2){
                max3=max2;
                max2=ele;
            }else if(ele >=max3){
                max3=ele;
            }
        }
        
        return Math.max(min1*min2*max1 , max1*max2*max3);
        
        
    }
}