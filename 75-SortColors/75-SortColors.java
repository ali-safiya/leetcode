// Last updated: 03/08/2025, 20:55:28
class Solution {
    public void sortColors(int[] nums) {

        int high = nums.length-1;

        int low =0, mid=0;

        while(mid<=high){

            if(nums[mid]==0){
                swap(low,mid,nums);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(mid,high,nums);
                high--;
            }
        }
    }

    public void swap(int index1, int index2, int[] nums){
        int temp = nums[index1];
        nums[index1]= nums[index2];
        nums[index2] = temp;
    }
}