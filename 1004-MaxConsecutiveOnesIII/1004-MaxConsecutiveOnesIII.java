// Last updated: 14/10/2026, 22:09:57
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3
4        int n = nums.length;
5
6        int left =0;
7        int zeroCount =0;
8        int maxLen = 0;
9
10        for(int i=0;i<n;i++){
11
12            if(nums[i]== 0){
13                zeroCount++;
14            }
15
16            while(zeroCount > k){
17                if(nums[left] == 0){
18                    zeroCount--;
19                }
20                left++;
21            }
22            maxLen = Math.max(maxLen,i-left+1);
23
24        }
25        return maxLen;
26    }
27}