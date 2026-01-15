// Last updated: 15/01/2026, 15:25:42
1class Solution {
2    public int majorityElement(int[] nums) {
3
4        int count =0 ;
5        int ele = 0;
6
7        for(int i =0 ;i<nums.length;i++){
8
9            if(count ==0){
10                count++;
11                ele = nums[i];
12            }
13            else if(ele == nums[i]){
14                count++;
15            }
16            else{
17                count--;
18            }
19        }
20
21        count =0;
22
23        for(int i=0;i<nums.length;i++){
24            if(nums[i]==ele){
25                count++;
26            }
27        }
28
29        if(count > nums.length/2){
30            return ele;
31        }
32        return -1;
33        
34    }
35}