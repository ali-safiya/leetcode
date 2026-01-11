// Last updated: 12/01/2026, 02:40:46
1class Solution {
2    public void sortColors(int[] nums) {
3
4
5            int low = 0;
6            int high = nums.length-1;
7            int mid = 0;
8
9            while(mid<=high){
10
11                if(nums[mid]== 0){
12                    swap(low,mid,nums);
13                    mid++;
14                    low++;
15                }
16                else if(nums[mid]== 2){
17                    swap(mid,high,nums);
18                    high--;
19                }
20                else{
21                    mid++;
22                }
23            }            
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