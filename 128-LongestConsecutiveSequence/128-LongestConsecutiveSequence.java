// Last updated: 12/10/2026, 01:17:39
1class Solution {
2    public int longestConsecutive(int[] nums) {
3
4        HashSet<Integer> set= new HashSet<>();
5
6        for(int num: nums){ 
7            set.add(num);
8        }
9
10        int longestSeq =0;
11
12        for(int num:set){
13
14            if(!set.contains(num-1)){
15
16                int count =0;
17
18                while(set.contains(num++)){
19                    count++;
20                }
21
22                longestSeq = Math.max(longestSeq,count);
23
24            }
25        }
26
27        return longestSeq;
28    }
29}