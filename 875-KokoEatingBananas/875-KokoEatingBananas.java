// Last updated: 15/10/2026, 01:53:29
1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3
4        int low =1;
5        int high= 0;
6
7        for(int i=0;i<piles.length;i++){
8            high = Math.max(high,piles[i]);
9        }
10        
11        return findEatingHours(low,high,piles,h);
12    }
13
14    private int findEatingHours(int low, int high, int[] piles, int h){
15
16        int ans =-1;
17
18        while(low<=high){
19
20            int mid = low + (high-low)/2;
21
22            if(canEat(mid,piles, h)){
23                ans = mid;
24                high=mid-1;
25            }
26            else{
27                low=mid+1;
28            }
29        
30        }
31        return ans;
32    }
33
34    private boolean canEat(int speed , int[] piles, int hours){
35
36        int hoursTaken =0;
37        for(int i=0;i<piles.length;i++){
38            hoursTaken += ((long) piles[i] + speed - 1) / speed;
39            if(hoursTaken > hours ) return false;
40        }
41        return true;
42    }
43}