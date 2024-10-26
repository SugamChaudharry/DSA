public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(9);
        list.insertLast(8);
        list.insertLast(7);
        list.insertLast(6);
        list.insertLast(5);
        list.insertLast(4);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);
        list.insertLast(0);
        
        list.display();
        list.sortList();
        list.display();


    }
}