import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner input = new Scanner(System.in);
        tree.populate(input);
        tree.display();
        tree.prettyDisplay();
        BinarySearchTree t = new BinarySearchTree();
        t.insert(6);
        t.insert(3);
        t.insert(1);
        t.insert(4);
        t.insert(8);
        t.insert(10);
        t.insert(7);
        t.insert(9);
        t.display();
        t.prettyDisplay();
    }
}
















