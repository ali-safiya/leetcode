// Last updated: 25/02/2026, 01:11:25
1class MyQueue {
2
3    Stack<Integer> s1;
4    Stack<Integer> s2;
5    int front=0;;
6
7    public MyQueue() {
8        s1 = new Stack<Integer>();
9        s2 = new Stack<Integer>();
10    }
11    
12    public void push(int x) {
13        if(s1.isEmpty()){
14            front=x;
15        }
16        s1.push(x);
17    }
18    
19    public int pop() {
20        if(s2.isEmpty()){
21            while(!s1.isEmpty()){
22                s2.push(s1.pop());
23            }
24        }
25        return s2.pop();
26    }
27    
28    public int peek() {
29        if(!s2.isEmpty()){
30            return s2.peek();
31        }
32        return front;
33    }
34    
35    public boolean empty() {
36        return s1.isEmpty() && s2.isEmpty();           
37    }
38}
39
40/**
41 * Your MyQueue object will be instantiated and called as such:
42 * MyQueue obj = new MyQueue();
43 * obj.push(x);
44 * int param_2 = obj.pop();
45 * int param_3 = obj.peek();
46 * boolean param_4 = obj.empty();
47 */