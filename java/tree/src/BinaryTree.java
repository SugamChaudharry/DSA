import java.util.Scanner;

public class BinaryTree {
    BinaryTree(){

    }

    private static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }

    private Node root;

    public void populate(Scanner inp){
        System.out.println("Enter root node : ");
        int val = inp.nextInt();
        root = new Node(val);
        populate(inp, root);
    }
    private void populate(Scanner inp, Node node){
        System.out.println("Do u want to add left of "+ node.val+" [y/n]");
        char f = inp.next().charAt(0);
        if(f == 'y'){
           System.out.print("Enter left value : ");
           int val = inp.nextInt();
           node.left = new Node(val);
           populate(inp,node.left);
        }

        System.out.println("Do u want to add right of "+ node.val+" [y/n]");
        f = inp.next().charAt(0);
        if(f == 'y'){
            System.out.print("Enter left value : ");
            int val = inp.nextInt();
            node.right = new Node(val);
            populate(inp,node.right);
        }
    }
    public void display(){
        display(root,"");
    }

    private void display(Node node, String indent) {
        if(node == null){
            return;
        }
        System.out.println(indent+ node.val);
        display(node.left, indent+"\t");
        display(node.right, indent+"\t");
    }
    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.val);
        } else {
            System.out.println(node.val);
        }
        prettyDisplay(node.left, level + 1);
    }

    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.val + " ");
        inOrder(node.right);
    }
    public void postOrder(){
        postOrder(root);
    }

    private void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.val + " ");
    }
}
