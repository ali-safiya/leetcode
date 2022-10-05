class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int i=0,j=0;
        int max=0,curMax=0;
        int n =nums.length;
        
        while(i<n){
            
            while(i<n && nums[i]!=1)
                i++;
            j=i;
            while(j<n && nums[j]==1){
                j++;
            }
            curMax= j-i;
            max=Math.max(curMax,max);
            i=j;
        }
        
        return max;
    }
}