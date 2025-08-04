// Last updated: 04/08/2025, 13:19:22
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        findSubsets(results,nums,temp,0);
        return results;
    }

    private void findSubsets(List<List<Integer>> results,int[] nums,List<Integer> temp , int index){

        if(index > nums.length) return;
        results.add(new ArrayList<>(temp));


        for(int i= index;i<nums.length;i++){

            if(i > index && nums[i] == nums[i-1]) continue;

            temp.add(nums[i]);
            findSubsets(results,nums,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
}