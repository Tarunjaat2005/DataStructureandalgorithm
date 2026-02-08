class MyLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    int size;

    public MyLinkedList() {
        head = new Node(0);
        size = 0;
        
    }
    
    public int get(int index) {
        if(index < 0 || index >= size){
            return -1;
        }
        Node curr = head.next;

        for(int i = 0 ; i  < index ; i++){
            curr = curr.next;
        }
        return curr.data;
        
    }
    
    public void addAtHead(int val) {
        Node curr = new Node(val);
        curr.next = head.next;
        head.next = curr;
        size++;

    }
    
    public void addAtTail(int val) {
        Node tail = new Node(val);
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = tail;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size){
            return;
        }
        Node curr = new Node(val);
        Node prev= head;
        for(int i = 0 ; i < index ; i++){
            prev= prev.next;
        }
        curr.next = prev.next;
        prev.next = curr;
        size++;

    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size){
            return;
        }

        Node curr = head;
        
        for(int i = 0 ; i < index ; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
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