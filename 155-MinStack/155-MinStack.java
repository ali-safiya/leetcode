// Last updated: 22/02/2026, 03:08:34
1class MinStack {
2
3    private Node top;
4
5    private class Node{
6        int value;
7        int min;
8        Node next;
9
10        private Node(int value, int min, Node next){
11            this.value= value;
12            this.min = min;
13            this.next = next;
14        }
15    }
16
17    public MinStack() {
18        top = null;
19    }
20    
21    public void push(int val) {
22        int min = top!=null ? Math.min(top.min,val) : val;
23        
24        Node nextNode = new Node(val,min,top);
25        top = nextNode;
26    }
27    
28    public void pop() {
29        top = top.next;
30    }
31    
32    public int top() {
33        return top.value;
34    }
35    
36    public int getMin() {
37        return top.min;
38    }
39}
40
41/**
42 * Your MinStack object will be instantiated and called as such:
43 * MinStack obj = new MinStack();
44 * obj.push(val);
45 * obj.pop();
46 * int param_3 = obj.top();
47 * int param_4 = obj.getMin();
48 */