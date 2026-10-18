// Last updated: 18/10/2026, 07:57:22
1class Solution {
2    public int[] asteroidCollision(int[] asteroids) {
3
4        int n = asteroids.length;
5
6        Stack<Integer> st = new Stack<>();
7
8        for(int i=0;i<n;i++){
9
10            boolean alive = true;
11            while(!st.isEmpty() && st.peek() > 0 && asteroids[i] < 0){
12
13                int cur = st.peek();
14                if(cur > Math.abs(asteroids[i])){
15                    alive = false;
16                    break;
17                }
18                else if(cur == Math.abs(asteroids[i])){
19                    st.pop();
20                    alive= false;
21                    break;
22                }
23                else{
24                    alive= true;
25                    st.pop();
26                }
27            }
28            if(alive)
29            st.push(asteroids[i]);
30        }
31        int[] ans = new int[st.size()];
32        int i=st.size()-1;
33        while(!st.isEmpty()){
34            ans[i--] = st.pop();
35        }
36        return ans;
37    }
38}