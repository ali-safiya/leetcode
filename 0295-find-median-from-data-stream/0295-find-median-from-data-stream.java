class MedianFinder {
    
    PriorityQueue<Integer> minque ;
    PriorityQueue<Integer> maxque;

    public MedianFinder() {
        
        minque = new PriorityQueue<Integer>((a,b) -> b-a);
        maxque = new PriorityQueue<Integer>((a,b) -> a-b);
        
    }
    
    public void addNum(int num) {
        if(minque.isEmpty() || minque.peek() >= num){
            minque.offer(num);
            
            if(minque.size() > maxque.size()+1){
                maxque.offer(minque.poll());
            }
        }
        else{
            maxque.offer(num);
            
            if(minque.size() < maxque.size()){
                minque.offer(maxque.poll());
            }  
        }
    }
    
    public double findMedian() {
        if(minque.size()>maxque.size())
            return minque.peek();
        else
            return (minque.peek()+maxque.peek())/2.0;
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */