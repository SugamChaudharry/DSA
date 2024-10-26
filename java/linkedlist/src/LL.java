public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node n = new Node(val);
        n.next = head;
        head = n;

        if(tail == null){
            tail = head;
        }
        size+=1;
    }
    public void insertLast(int val){
        if(tail == null) {
            insertFirst(val);
            return;
        }
        Node n = new Node(val,null);
        tail.next = n;
        tail = n;
        size+=1;
    }
    public void insertAt(int p , int val){
        if (p==0)insertFirst(val);
        if(p==size) insertLast(val);

        Node temp = head;
        for (int i = 1; i < p; i++) {
            temp = temp.next;
        }

        Node n = new Node(val,temp.next);
        temp.next = n;

        size++;
    }
    public void insertRcc(int val, int index){
        head = insertRcc(val,index,head );
    }
    private Node insertRcc(int val, int index, Node node){
        if(index == 0){
            Node newNode = new Node(val,node);
            size++;
            return newNode;
        }
        node.next = insertRcc(val,--index,node.next);
        return node;
    }
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if(size <=1){
            return deleteFirst();
        }
        Node temp = head;
        for (int i = 1; i < size - 1; i++) {
            temp = temp.next;
        }
        tail = temp;
        temp.next = null;
        size--;
        return temp.value;
    }
    public void deleteDuplicates() {
        head = DeleteDuplecate(head,head);
    }

    private Node DeleteDuplecate(Node cnode, Node nextNode){
        if(nextNode == null){
            return null;
        }
        if(cnode.value == nextNode.value){
            DeleteDuplecate(cnode,nextNode.next);
        }else{
        cnode.next = DeleteDuplecate(nextNode,nextNode.next);
        }
        return cnode;
    }
    public  void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + "--> ");
            temp = temp.next;
        }
        System.out.println("End");
    }
    
    public void sortList(){
        sortList(head);
    }
    private Node sortList(Node head) {

        if(head.next == null){
            return head;
        }

        Node middle = getMid(head);

        Node left = sortList(head);
        Node right = sortList(middle);

        return mergeTwoLists(left , right);
    }
    private Node mergeTwoLists(Node l, Node ll) {
        Node head = new Node(0);
        Node temp = head;

        while( (l != null) && (ll != null) ){
            if(l.value <= ll.value) {
                temp.next = l;
                l = l.next;
                temp = temp.next;
            }
            else {
                temp.next = ll;
                ll = ll.next;
                temp = temp.next;
            }

        }
        temp.next = (l == null) ? ll : l;
        return head.next;
    }
    public Node getMid(Node head) {
        Node s = head;
        Node f = head;

        while( (f != null) && (f.next != null) ){
            s = s.next;
            f = f.next.next;
        }
        Node right = s.next;
        s.next = null;
        return right;
    }
    
    private  class Node{
        private int value;
        private Node next;

        public Node (int value) {
            this.value = value;
        }
        public Node (int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
