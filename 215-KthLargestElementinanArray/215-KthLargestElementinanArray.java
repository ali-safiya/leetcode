// Last updated: 02/03/2026, 03:24:44
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3
4        return quickSelect(nums,0,nums.length-1,nums.length-k);
5        
6    }
7
8    private int quickSelect(int[] nums, int low, int high, int k){
9
10        int pivotIndex = partition(nums,low,high);
11
12        if(pivotIndex == k) return nums[pivotIndex];
13        else if(pivotIndex < k) return quickSelect(nums,pivotIndex+1,high,k);
14        else return quickSelect(nums,low,pivotIndex-1,k);
15
16    }
17
18    private int partition(int[] nums, int low, int high){
19
20        int pivot = nums[high];
21
22        int i =low;
23
24        for(int j=low;j<high ;j++){
25
26            if(nums[j] < pivot){
27                swap(i,j,nums);
28                i++;
29            }
30        }
31        swap(i,high,nums);
32        return i;
33    }
34
35    private void swap(int i, int j, int[] nums){
36
37        int temp = nums[i];
38        nums[i] = nums[j];
39        nums[j] = temp;
40    }
41}