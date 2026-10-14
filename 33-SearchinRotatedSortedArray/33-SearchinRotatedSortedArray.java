// Last updated: 15/10/2026, 01:20:44
1class Solution {
2    public int search(int[] nums, int target) {
3
4        int low =0;
5        int high = nums.length-1;
6
7        while(low<=high){
8
9            int mid = low + (high-low)/2;
10
11            if(nums[mid] == target)
12                return mid;
13            
14            if(nums[low] <= nums[mid]){
15
16                if(nums[low] <= target && target < nums[mid]){
17                    high=mid-1;
18                }
19                else{
20                    low=mid+1;
21                }
22            }
23            else{
24
25                if(target > nums[mid] && nums[high] >= target){
26                    low=mid+1;
27                }
28                else{
29                    high = mid-1;
30                }
31            }
32        }
33
34        return -1;
35        
36    }
37}