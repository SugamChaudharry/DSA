public class CLL {
    Node head;
    Node tail;
    int next;

    CLL(){
        this.head = null;
        this.tail = null;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            node.next = head;
            return;
        }
        node.next = head;
        head.next = node;
    }

    class Node{
        int val;
        Node next;
        Node prev;

        Node (int val){
            this.val = val;
        }
        Node (int val, Node prev, Node next){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
