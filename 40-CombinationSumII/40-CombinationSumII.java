// Last updated: 20/02/2026, 03:37:06
1class Solution {
2    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
3        Arrays.sort(candidates);
4        List<List<Integer>> ans = new ArrayList<>();
5        List<Integer> temp = new ArrayList<>();
6        findComb(candidates,0, target, temp,ans);
7        return ans;
8
9    }
10
11    private void findComb(int[] nums, int ind, int target, List<Integer> temp, List<List<Integer>> ans){
12        
13
14        if(target == 0){
15            ans.add(new ArrayList<>(temp));
16            return;
17        }
18        if(target<0 || ind>=nums.length) return;
19
20        for(int i=ind;i<nums.length;i++){
21            if(i>ind && nums[i]== nums[i-1]) continue;
22            temp.add(nums[i]);
23            findComb(nums,i+1,target-nums[i],temp,ans);
24            temp.remove(temp.size()-1);
25        }
26    }
27
28
29
30}