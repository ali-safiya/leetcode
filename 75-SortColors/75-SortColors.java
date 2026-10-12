// Last updated: 12/10/2026, 20:42:39
1class Solution {
2    public void sortColors(int[] nums) {
3
4        int n = nums.length;
5        int low =0;
6        int mid=0;
7        int high = n-1;
8
9        while(mid<=high){
10
11            if(nums[mid]==1){
12                mid++;
13            }
14            else if(nums[mid] ==2){
15                swap(high,mid,nums);
16                high--;
17            }
18            else{
19                swap(low,mid,nums);
20                mid++;
21                low++;
22            }
23        }
24        
25        }
26  
27
28    public void swap(int index1, int index2, int[] nums){
29        int temp = nums[index1];
30        nums[index1]= nums[index2];
31        nums[index2] = temp;
32    }
33}