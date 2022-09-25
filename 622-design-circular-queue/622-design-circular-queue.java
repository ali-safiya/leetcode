class MyCircularQueue {
    
    int[] q;
    int front;
    int rear;
    int k;

    public MyCircularQueue(int k) {
        this.k=k;
        q =new int[k];
        front=0;
        rear=0;
        
    }
    
    public boolean enQueue(int value) {
        
        if(isFull()){
            return false;
        }
        q[rear%k]=value;
        rear++;
        return true;
        
    }
    
    public boolean deQueue() {
        
        if(isEmpty())
            return false;

        front++;
        return true;
        
    }
    
    public int Front() {
        if(isEmpty())
            return -1;
        return q[front%k];
        
    }
    
    public int Rear() {
        if(isEmpty())
            return -1;
        
        return q[(rear-1)%k];
        
        
    }
    
    public boolean isEmpty() {
         if(front==rear)
            return true;
        return false;
        
    }
    
    public boolean isFull() {
         if(rear-front == k){
            return true;
         }   
        return false;
        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */