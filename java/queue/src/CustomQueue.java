public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int end = 0;
    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        this.data = new int[size];
    }
    public boolean isFull() {
        return end == data.length;
    }
    public boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item){
        if( isFull()){
            return false;
        }
        data[end++] = item;
        return true;
    }
    public int remove() throws Exception {
        if ( isEmpty() ){
            throw new Exception("Cannot pop from an empty array");
        }
        int removedItem = data[0];

        for (int i = 1; i < data.length; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removedItem;
    }
}
