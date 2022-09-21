class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        
        int sum=0;
        
        for(int ele: nums){
            if(ele%2==0)
                sum+=ele;
        }
        int n=queries.length;
        int[] ans = new int[n];
        
        for(int i=0;i<n;i++){
            
            int val=queries[i][0];
            int index=queries[i][1];
            
            if(nums[index]%2==0){
                sum-=nums[index];
            }
            nums[index]+=val;
            if(nums[index]%2==0){
                sum+=nums[index];
            }
            ans[i]=sum;
        }
        return ans;
    }
}