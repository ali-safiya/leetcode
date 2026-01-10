// Last updated: 11/01/2026, 01:44:35
1class Solution {
2    public void nextPermutation(int[] nums) {
3
4        int i = nums.length-2;
5
6        while(i>=0 && nums[i] >= nums[i+1]){
7            i--;
8        }
9// System.out.println("i:" + i);
10        if(i==-1){
11            reverse(nums,0,nums.length-1);
12        }
13        else{
14            int j=nums.length-1;
15            while(j>i){
16                if(nums[i]<nums[j]){
17                    swap(nums,i,j);
18                    reverse(nums,i+1,nums.length-1);
19                    break;
20                }
21                j--;
22            }
23        }
24        
25    }
26
27    private void swap(int[] nums, int i , int j){
28        int temp=nums[i];
29        nums[i]=nums[j];
30        nums[j]= temp;
31    }
32
33    private void reverse(int [] nums, int i , int j){
34        while(i<j){
35            swap(nums,i,j);
36            i++;
37            j--;
38        }
39    }
40
41}