// Last updated: 20/01/2026, 23:53:47
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        
4        int n = nums.length;
5        int[][] numsWithIndex = new int[n][2];
6
7        for(int i=0;i<n;i++){
8            numsWithIndex[i][0] = nums[i];
9            numsWithIndex[i][1] = i;
10        }
11
12        Arrays.sort(numsWithIndex, (a,b) -> Integer.compare(a[0], b[0]));
13
14        int left =0;
15        int right = n-1;
16        while(left < right){
17
18            if(numsWithIndex[left][0] + numsWithIndex[right][0] == target){
19                return new int[]{numsWithIndex[left][1], numsWithIndex[right][1]};
20            }
21            else if(numsWithIndex[left][0] + numsWithIndex[right][0] < target){
22                left++;
23            }
24            else{
25                right--;
26            }
27        }
28        return new int[]{-1,-1};
29    }
30}