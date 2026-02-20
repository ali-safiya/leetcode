// Last updated: 21/02/2026, 03:47:29
1class Solution {
2    public boolean isValid(String s) {
3
4        Stack<Character> st = new Stack<>();
5        
6        for(int i=0;i<s.length();i++){
7
8            char c = s.charAt(i);
9            if(c== '(' || c == '{' || c== '['){
10                st.push(c);
11            }
12            else{
13                if(st.isEmpty()) return false;
14                else{
15        
16
17                         if(c == ')' && st.peek() == '('){
18                            st.pop();
19                        }
20                        else if( c == '}' && st.peek() == '{'){
21                            st.pop();
22                        }
23                        else if( c== ']' && st.peek() == '['){
24                            st.pop();
25                        }
26                        else{
27                            return false;
28                        }
29                }
30            }
31        }
32        return st.size()==0;
33    }
34}