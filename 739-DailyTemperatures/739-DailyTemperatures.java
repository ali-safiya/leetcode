// Last updated: 18/10/2026, 06:39:22
1class Solution {
2    public int[] dailyTemperatures(int[] temperatures) {
3
4        Stack<int[]> st = new Stack<>();
5        int n = temperatures.length;
6        int[] ans = new int[n];
7
8        for(int i=0;i<n;i++){
9            while(!st.isEmpty()  && st.peek()[0] < temperatures[i]){
10                int[] cur = st.pop();
11                ans[cur[1]]= i-cur[1];
12            }
13            st.push(new int[]{temperatures[i],i}); 
14        }
15
16        return ans;
17        
18    }
19}