 class Node{
            int val;
            Node next;
            public Node(int val){
                this.val=val;
                this.next=null;
            }
        }


class MyLinkedList {
    
    public Node head;
    int size;
    public MyLinkedList() {
       size=0;
       head=new Node(0); 
    }
    
    public int get(int index) {
        Node temp =head;
         if(index < 0 || index >= size){
            return -1;
        }
        for(int i=0;i<=index;i++){
            temp=temp.next;
        }
       return temp.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0,val);
        
    }
    
    public void addAtTail(int val) {
        addAtIndex(size,val);
        
    }
    
    public void addAtIndex(int index, int val) {
        Node newNode = new Node(val);
        Node temp =head;
        if(index>size)
            return;
        if(index<0)
            index=0;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        newNode.next= temp.next;
        temp.next=newNode;
        size++;
        
    }
    
    public void deleteAtIndex(int index) {
        Node temp =head;
         if(index < 0 || index >= size){
            return;
        }
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */