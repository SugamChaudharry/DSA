public class Main {
    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree();
//        Scanner input = new Scanner(System.in);
//        tree.populate(input);
//        tree.display();
//        tree.prettyDisplay();
//        BinarySearchTree t = new BinarySearchTree();
//        t.insert(6);
//        t.insert(3);
//        t.insert(1);
//        t.insert(4);
//        t.insert(8);
//        t.insert(10);
//        t.insert(7);
//        t.insert(9);
//        t.display();
//        t.prettyDisplay();
//        AVL t = new AVL();
//        for (int i = 0; i < 50; i++) {
//            t.insert(i);
//        }
//
//        System.out.println(t.height());
//        System.out.println(t.balanced());
//        System.out.println("=====================================================");
//        t.prettyDisplay();

        int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};
        Segment tree = new Segment(arr);
         tree.display();

        System.out.println(tree.query(1, 6));

    }
}
















