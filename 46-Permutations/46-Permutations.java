// Last updated: 21/02/2026, 03:13:14
1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3
4        List<List<Integer>> results = new ArrayList<>();
5        find(nums,results,0);
6        return results;
7    }
8
9    private void find(int[] nums,List<List<Integer>> results,int index ){
10
11        if(index== nums.length){
12            List<Integer> temp = new ArrayList<>();
13            for(int num: nums) temp.add(num);
14            results.add(temp);
15            return;
16        }
17
18        for(int i=index;i<nums.length;i++){
19            swap(index,i,nums);
20            find(nums,results,index+1);
21            swap(index,i,nums);
22        }
23    }
24
25    private void swap(int i, int j , int[] nums){
26
27        int temp=nums[i];
28        nums[i] = nums[j];
29        nums[j] = temp;
30    }
31}