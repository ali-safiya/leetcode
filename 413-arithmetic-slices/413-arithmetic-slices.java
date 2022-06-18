class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        if(n<=2) return 0;
         int count=0;
        int diff=0;
        for(int i=0;i<n-2;i++){
            diff=nums[i+1]-nums[i];
            for(int j=i+2;j<n;j++ ){
               System.out.print("iff" +diff);
                if((j-i)>=2  && (nums[j]-nums[j-1]==diff))
                {
                   count++;
                }else
                    break;
                
            }
        }
       
       
            
        return count;
    }
}