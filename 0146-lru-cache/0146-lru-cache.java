class LRUCache {
    
    class Node{
        int key;
        int val;
        Node next;
        Node prev;
        Node(int key, int val){
            this.key=key;
            this.val=val;
        }
    }
        Node head;
        Node tail;
        HashMap<Integer,Node> map;
        int cap;

    public LRUCache(int capacity) {
        
        cap=capacity;
        map= new HashMap<Integer,Node>(cap);
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
        
    }
    
    public int get(int key) {
        
        if(map.containsKey(key)){
            Node temp = map.get(key);
            delete(temp);
            insert(temp);
            return temp.val;            
        }
        else
            return -1;
        
    }
    
    public void put(int key, int value) {
        
        if(map.containsKey(key)){
            delete(map.get(key));
        }
        if(map.size()==cap){
            delete(tail.prev);
        }
        insert(new Node(key,value));
        
    }
    
    public void delete(Node node){
        map.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    public void insert(Node node){
        map.put(node.key,node);
        Node headnext=head.next;
        
        head.next=node;
        node.prev=head;
        headnext.prev=node;
        node.next=headnext;
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
