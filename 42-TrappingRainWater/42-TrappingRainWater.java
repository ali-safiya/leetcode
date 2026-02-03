// Last updated: 03/02/2026, 18:39:44
1class Solution {
2    public int trap(int[] height) {
3
4        int low =0;
5        int high =height.length-1;
6
7        int totalWater = 0;
8        int maxLeft=0;
9        int maxRight=0;
10
11        while(low<high){
12            if(height[low] <= height[high]){
13                if(maxLeft < height[low]){
14                    maxLeft = height[low];
15                }
16                else{
17                    totalWater+= maxLeft -height[low];
18                }
19                low++;
20            }
21            else{
22                if(maxRight < height[high]){
23                    maxRight = height[high];
24                }
25                else{
26                    totalWater+= maxRight -height[high];
27                }
28                high--; 
29            }
30        }
31        return totalWater;
32        
33    }
34}