// Last updated: 12/10/2026, 19:59:37
1class Solution {
2    public int maxArea(int[] height) {
3
4        int n = height.length;
5        int x = 0;
6        int y= n-1;
7        int maxWaterArea = 0;
8
9        while(x<y){
10
11            int waterArea = Math.min(height[x],height[y])*(y-x);
12            maxWaterArea = Math.max(waterArea,maxWaterArea);
13
14            if(height[x]>height[y]){
15                y--;
16            }
17            else{
18                x++;
19            }
20
21        }
22        return maxWaterArea;
23    }
24}