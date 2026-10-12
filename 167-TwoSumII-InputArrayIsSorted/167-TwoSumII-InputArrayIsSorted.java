// Last updated: 12/10/2026, 19:28:41
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3
4        int[] indexes = new int[2];
5        int pt1 =0;
6        int pt2 = numbers.length -1;
7
8        while(pt1<pt2){
9            int sum = numbers[pt1] + numbers[pt2];
10            if(sum == target){
11                indexes[0]= pt1+1;
12                indexes[1]= pt2+1;
13                return indexes;
14            }
15            else if(sum > target){
16                pt2--;
17            }
18            else{
19                pt1++;
20            }
21        }
22        return indexes;       
23    }
24}