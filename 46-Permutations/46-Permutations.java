// Last updated: 05/08/2025, 13:57:18
class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> results = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        find(nums,results,0,temp);
        return results;
    }

    private void find(int[] nums,List<List<Integer>> results,int index, List<Integer> temp ){

        if(index==nums.length){
            results.add(new ArrayList<>(temp));
            return;
        }
        if(index > nums.length) return;

        for(int i= index;i<nums.length;i++){
            swap(i,index,nums);
            temp.add(nums[index]);
            find(nums,results,index+1,temp);
            temp.remove(temp.size()-1);
            swap(i,index,nums);
        }
    }

    private void swap(int i, int j , int[] nums){

        int temp=nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}