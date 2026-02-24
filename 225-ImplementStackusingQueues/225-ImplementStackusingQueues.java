// Last updated: 25/02/2026, 02:01:23
1class MyStack {
2
3    Queue<Integer> q;
4
5    public MyStack() {
6        q = new ArrayDeque<Integer>();
7    }
8    
9    public void push(int x) {
10        q.offer(x);
11
12        for(int i=0;i<q.size()-1;i++){
13            q.offer(q.poll());
14        }
15    }
16    
17    public int pop() {
18        return q.poll();
19    }
20    
21    public int top() {
22        return q.peek();
23    }
24    
25    public boolean empty() {
26        return q.isEmpty();
27    }
28}
29
30/**
31 * Your MyStack object will be instantiated and called as such:
32 * MyStack obj = new MyStack();
33 * obj.push(x);
34 * int param_2 = obj.pop();
35 * int param_3 = obj.top();
36 * boolean param_4 = obj.empty();
37 */