// Last updated: 12/10/2026, 01:00:00
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        
4        int n = nums.length;
5        int[] ans = new int[n];
6
7        ans[0]=1;
8        for(int i=1;i<n;i++){
9            ans[i] = ans[i-1]* nums[i-1];
10        }
11
12        int product=nums[n-1];
13        for(int i=n-2;i>=0;i--){
14            ans[i]= ans[i]*product;
15            product*= nums[i];
16        }
17
18        return ans;
19    }
20}