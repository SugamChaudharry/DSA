import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner input = new Scanner(System.in);
        tree.populate(input);
        tree.display();
        tree.prettyDisplay();
    }
}
















