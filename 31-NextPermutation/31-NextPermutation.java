// Last updated: 01/08/2025, 14:39:31
class Solution {
    public void nextPermutation(int[] nums) {

         int n = nums.length;
         int i=n-2;

         while(i>=0 && nums[i+1]<= nums[i]){
            i--;
         }
         if(i>=0){
            int j= n-1;
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(i,j,nums);
         }
         reverse(nums,i+1);
        
    }

    private void swap(int index1 , int index2, int[] nums){
        int temp  = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    private void reverse(int[] nums, int start){
        int i=start;
        int j= nums.length-1;
        while(i<j){
            swap(i,j,nums);
            i++;
            j--;
        }
    }
}