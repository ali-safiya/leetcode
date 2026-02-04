// Last updated: 04/02/2026, 14:15:49
1class Solution {
2    public int removeDuplicates(int[] nums) {
3
4        int prev = nums[0];
5        int count = 1;
6
7        int i=1;
8        int j=1;
9
10        while(j<nums.length){
11
12            if(prev == nums[j]){
13                j++;
14            }
15            else{
16                prev= nums[j];
17                swap(i,j,nums);
18                count++;
19                i++;
20                j++;
21                
22            }
23        }
24        return count;
25    }
26
27    private void swap(int i, int j , int[] nums){
28        int temp = nums[i];
29        nums[i] = nums[j];
30        nums[j] = temp;
31    }
32}