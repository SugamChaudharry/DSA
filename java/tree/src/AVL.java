public class AVL {
    public static class Node{
        private final int val;
        private int height;
        private Node right;
        private Node left;

        public Node(int val){
            this.val = val;
        }
        public int getVal(){
            return this.val;
        }
    }
    private Node root;
    public AVL(){}

    public int height(){
        return height(root);
    }
    private int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void display(){
        display(root,"Root Node: ");
    }
    private void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.getVal());
        display(node.left, "Left child of "+ node.getVal()+" : ");
        display(node.right, "Right child of "+ node.getVal()+" : ");
    }


    public void insert(int val){
        root = insert(root,val);
    }

    private Node insert(Node node, int val){
        if(node == null){
            return new Node(val);
        }
        if(val < node.val){
            node.left = insert(node.left,val);
        }
        if(val > node.val){
            node.right = insert(node.right,val);
        }

        node.height = Math.max(height(node.left), height(node.right))+1;
        return rotate(node);
    }
    private Node rotate(Node node){
        if(height(node.left) - height(node.right) > 0){
            if(height(node.left.left) - height(node.left.right) > 0) {
                return rightRotate(node);
            }
            if(height(node.left.left) - height(node.left.right) < 0){
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }

        }else if(height(node.left) - height(node.right) < -1){
            if(height(node.right.left) - height(node.right.right) < 0)
                return leftRotate(node);
            if(height(node.right.left) - height(node.right.right) > 0){
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    private Node leftRotate(Node p) {
        Node c = p.right;
        Node t = c.left;

        c.left = p;
        p.right = t;

        p.height = 1+ Math.max(height(p.left), height(p.right));
        c.height = 1+ Math.max(height(c.left), height(c.right));

        return c;
    }

    private Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left) , height(p.right))+1;
        c.height = Math.max(height(c.left) , height(c.right))+1;

        return c;
    }

    public void populatedSorted(int[] nums) {
        populatedSorted(nums, 0, nums.length);
    }

    private void populatedSorted(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        this.insert(nums[mid]);
        populatedSorted(nums, start, mid);
        populatedSorted(nums, mid + 1, end);
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

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

}
