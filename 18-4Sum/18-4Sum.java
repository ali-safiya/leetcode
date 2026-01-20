// Last updated: 21/01/2026, 00:41:03
1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3
4        int n = nums.length;
5        Arrays.sort(nums);
6
7        List<List<Integer>> ans = new ArrayList<>();
8        
9        for(int i =0;i<n;i++){
10            if(i>0 && nums[i]== nums[i-1]) continue;
11            for(int j=i+1;j<n;j++){
12                if(j>i+1 && nums[j]==nums[j-1]) continue;
13
14                int low = j+1;
15                int high = n-1;
16
17                while(low<high){
18
19                    long sum = (long) nums[i]+nums[j]+ nums[low] + nums[high];
20                    if(sum  == target){
21                        
22                        ans.add(Arrays.asList(nums[i],nums[j], nums[low],nums[high]));
23                        while(low<high && nums[low]==nums[low+1]) low++;
24                        while(low<high && nums[high]==nums[high-1]) high--;
25                        low++;
26                        high--;
27                    }
28                    else if(sum  < target){
29                        low++;
30                    }
31                    else{
32                        high--;
33                    }
34                }
35
36            }
37        }
38        return ans;
39    }
40}