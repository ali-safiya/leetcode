// Last updated: 25/02/2026, 02:50:11
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3
4        int low =0;
5        int high = nums.length-1;
6
7        while(low<high){
8            int mid = low+ (high-low)/2;  
9
10            if(mid% 2 == 1) mid--;       
11            
12            if(nums[mid] == nums[mid+1]){
13                low= mid+2;
14            }
15            else{
16                high=mid;
17            }
18        }
19        return nums[low];
20    }
21}