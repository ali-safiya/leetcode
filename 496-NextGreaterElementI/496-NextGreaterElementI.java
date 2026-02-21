// Last updated: 22/02/2026, 02:17:58
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3
4        Stack<Integer> st = new Stack<Integer>();
5
6        HashMap<Integer, Integer> map = new HashMap<>();
7
8        for(int num:nums2){
9
10            while(!st.isEmpty() && num > st.peek()){
11                map.put(st.pop(),num);
12            }
13            st.push(num);
14        }
15
16        while(!st.isEmpty()){
17            map.put(st.pop(),-1);
18        }
19
20        int[] ans = new int[nums1.length];
21
22        for(int i=0;i<nums1.length;i++){
23
24            ans[i] = map.get(nums1[i]);
25        }
26
27        return ans;
28        
29    }
30}