// Last updated: 09/01/2026, 16:58:14
1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3
4       List<List<Integer>> ans = new ArrayList<>();
5       
6        ans.add(new ArrayList<>(List.of(1)));
7      
8        for(int i =1; i<numRows;i++){
9
10            List<Integer> row = new ArrayList<>();
11
12            row.add(1);
13            for(int j=1;j<i;j++){
14
15                row.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
16            }
17            row.add(1);
18
19            ans.add(new ArrayList<>(row));
20        }
21
22        return ans;
23    }
24}