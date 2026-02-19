// Last updated: 20/02/2026, 03:16:11
1class Solution {
2    public List<List<Integer>> subsetsWithDup(int[] nums) {
3
4        Arrays.sort(nums);
5        List<List<Integer>> ans = new ArrayList<>();
6        List<Integer> temp = new ArrayList<>();
7        findSubsets(nums,0, ans, temp);
8        return ans;
9        
10    }
11
12    private void findSubsets(int[] nums, int ind, List<List<Integer>> ans , List<Integer> temp){
13        if(ind > nums.length) return;
14        ans.add(new ArrayList<>(temp));
15
16
17        for(int i= ind;i<nums.length;i++){
18
19            if(i>ind && nums[i] == nums[i-1]) continue;
20            temp.add(nums[i]);
21            findSubsets(nums,i+1,ans,temp);
22            temp.remove(temp.size()-1);
23        }
24    }
25
26    
27}