public class Segment {
    public static class Node {
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    Node root;
    public Segment(int[] arr){
        this.root = constructTree(arr, 0, arr.length - 1);
    }

    private Node constructTree(int[] arr, int start, int end) {
        if(start == end){
            Node node = new Node(start,end);
            node.data = arr[start];
            return node;
        }

        Node node = new Node(start,end);
        int mid = (start + end) / 2;
        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr, mid+1, end);

        node.data = node.left.data + node.right.data;

        return node;
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
            System.out.println("|------->" + node.data + " [ "+ node.startInterval + ", "+ node.endInterval +" ]");
        } else {
            System.out.println(node.data+ " [ "+ node.startInterval + ", "+ node.endInterval +" ]");
        }
        prettyDisplay(node.left, level + 1);
    }

    public int query (int qsi, int qei){
        return this.query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei){
        if(node.startInterval >= qsi && node.endInterval <= qei){
            // completely inside query;
            return node.data;
        }else if (node.startInterval > qei || node.endInterval < qsi) {
            return 0;
        }else {
            return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
        }
    }
    public void update(int index, int value) {
        this.root.data = update(this.root, index, value);
    }
    private int update(Node node, int index, int value) {
        if (index >= node.startInterval&& index <= node.endInterval){
            if(index == node.startInterval && index == node.endInterval) {
                node.data = value;
                return node.data;
            } else {
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);
                node.data = leftAns + rightAns;
                return node.data;
            }
        }
        return node.data;
    }
}
