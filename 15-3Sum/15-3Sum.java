// Last updated: 04/02/2026, 14:51:43
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        
4        List<List<Integer>> triplets = new ArrayList<>();
5
6        Arrays.sort(nums);
7
8        for(int i =0;i<nums.length;i++){
9
10            if(i>0 && nums[i]== nums[i-1]) continue;
11
12            int j =i+1; 
13            int k = nums.length-1;
14
15            while(j<k){
16                if(nums[j] + nums[k] + nums[i] == 0){
17                    List<Integer> temp = new ArrayList<Integer>();
18                    temp.add(nums[i]);
19                    temp.add(nums[j]);
20                    temp.add(nums[k]);
21                    triplets.add(temp);
22                    k--;
23                    j++;
24
25                    while(j < k && nums[j] == nums[j-1]) j++;
26                    while(k > j && nums[k] == nums[k+1]) k--;
27                }
28                else if(nums[j] + nums[k] + nums[i] > 0){
29                    k--;
30                }
31                else{
32                    j++;
33                }
34            }
35        }
36        return triplets;
37    }
38}