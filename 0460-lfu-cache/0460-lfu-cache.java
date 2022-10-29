class LFUCache {
    
    class Node{
        int key;
        int val;
        int frequency;
        Node prev;
        Node next;
        Node(int key , int val, int frequency){
            this.key = key;
            this.val= val;
            this.frequency=frequency;
        }
    }
    
    class DoubleLinkedList{
        
        int listSize;
        Node tail;
        Node head;
        
        DoubleLinkedList(){
            this.listSize=0;
            this.head=new Node(0,0,0);
            this.tail=new Node(0,0,0);
            head.next=tail;
            tail.prev=head;
        }
        
        public void remove(Node curNode ){
            curNode.prev.next=curNode.next;
            curNode.next.prev=curNode.prev;
            listSize--;
            
        }
        public void insert(Node curNode){
            
            Node nextNode = head.next;
            curNode.next=nextNode;
            curNode.prev=head;
            head.next=curNode;
            nextNode.prev= curNode;
            
            listSize++;
            
        }
    }
    
    
    HashMap<Integer,DoubleLinkedList> freq;
    HashMap<Integer,Node> item;
    
    int cap;
    int minFreq;
    int curSize;

    public LFUCache(int capacity) {
        
        cap=capacity;
        freq = new HashMap<Integer,DoubleLinkedList>();
        item = new HashMap<Integer, Node>(cap);
        
        minFreq =0;
        curSize=0;
        
    }
    
    public int get(int key) {
        
        if(item.containsKey(key)){
            Node temp = item.get(key);
            update(temp);
            return temp.val;
        }
        else
            return -1;
        
    }
    
    public void put(int key, int value) {
        
        if(cap==0)
            return;
        
        if(item.containsKey(key)){
            Node curNode = item.get(key);
            curNode.val= value;
            update(curNode);
        }
        else{
            curSize++;
            if(curSize> cap){
                DoubleLinkedList minFreqList = freq.get(minFreq);
                item.remove(minFreqList.tail.prev.key);
                minFreqList.remove(minFreqList.tail.prev);
                curSize--;
            }
            
            minFreq=1;
            Node newNode = new Node(key,value,1);
            
            DoubleLinkedList curList = freq.getOrDefault(1,new DoubleLinkedList());
            curList.insert(newNode);
            freq.put(1,curList);
            item.put(key,newNode);
            
        }
    }
    
    public void update(Node curNode){
        
        int curFreq = curNode.frequency;
        DoubleLinkedList curList = freq.get(curFreq);
        curList.remove(curNode);
        
        if(curFreq == minFreq && curList.listSize==0){
            minFreq++;
        }
        
        curNode.frequency++;
        freq.putIfAbsent(curFreq+1,new DoubleLinkedList());
        DoubleLinkedList newList = freq.get(curFreq+1);
        newList.insert(curNode);
        freq.put(curFreq+1, newList);
        
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */