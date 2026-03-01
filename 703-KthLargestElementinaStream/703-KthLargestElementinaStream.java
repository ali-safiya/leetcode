// Last updated: 02/03/2026, 02:45:42
1class KthLargest {
2
3    PriorityQueue<Integer> pq;
4    int k;
5    
6    public KthLargest(int k, int[] nums) {
7        pq = new PriorityQueue<>();
8        this.k= k;
9
10        for(int num:nums){
11
12            if(pq.size()<k){
13                pq.add(num);
14            }
15            else{
16                adjust(num);
17            }
18
19        }
20    }
21    
22    public int add(int val) {
23        if(pq.size()==k)
24            adjust(val);
25        else{
26            pq.add(val);
27        }
28        return pq.peek();
29        
30    }
31
32    private void adjust(int num){
33        if(pq.peek() < num){
34            pq.poll();
35            pq.add(num);
36        }
37    }
38}
39
40/**
41 * Your KthLargest object will be instantiated and called as such:
42 * KthLargest obj = new KthLargest(k, nums);
43 * int param_1 = obj.add(val);
44 */