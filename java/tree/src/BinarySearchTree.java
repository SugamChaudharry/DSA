public class BinarySearchTree {
    public class Node{
        private int val;
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
    public BinarySearchTree(){}

    public int height(Node node){
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

        return node;
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
