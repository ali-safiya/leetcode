// Last updated: 15/10/2026, 00:23:04
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int n = nums.length;
4        int low = 0;
5        int high = n-1;
6        int[] ans = new int[]{-1,-1};
7
8        while(low<=high){
9
10            int mid = low + (high - low) / 2;
11
12            if(target==nums[mid]){
13                ans[0]= findLeftIndex(low,mid,nums,target);
14                ans[1]= findRightIndex(mid,high,nums,target);
15                return ans;
16            }
17            else if(target > nums[mid]){
18                low=mid+1;
19            }
20            else{
21                high= mid-1;
22            }
23        }
24        return ans;
25    }
26
27    private int findLeftIndex(int low, int high, int[] nums, int target){
28
29        int ans=-1;
30
31        while(low<=high){
32            int mid= low + (high - low) / 2;
33
34            if(nums[mid]==target){
35                ans=mid;
36                high=mid-1;
37            }
38            else if(target > nums[mid]){
39                low=mid+1;
40            }
41            else{
42                high= mid-1;
43            }
44        }
45        return ans;
46    }
47
48    private int findRightIndex(int low, int high, int[] nums, int target){
49
50        int ans=-1;
51
52        while(low<=high){
53            int mid= low + (high - low) / 2;
54
55            if(nums[mid]==target){
56                ans=mid;
57                low=mid+1;
58            }
59            else if(target > nums[mid]){
60                low=mid+1;
61            }
62            else{
63                high= mid-1;
64            }
65        }
66        return ans;
67    }
68}