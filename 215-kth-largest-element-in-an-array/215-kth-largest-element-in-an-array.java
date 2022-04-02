class Solution {
    public int findKthLargest(int[] nums, int k) {
      
        int n= nums.length;
        
        for(int i=0;i<k;i++){
            
            for(int j=0;j<n-i-1;j++){
                
                if(nums[j]>nums[j+1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        
        for(int i=0;i<n;i++){
          
                System.out.print(nums[i]+" ");
           
        }
        
        return nums[n-k];
    }
}