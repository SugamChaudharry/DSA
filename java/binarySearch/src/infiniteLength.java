public class infiniteLength {
    public static void main(String[] args) {

    }
    static int binarySearch(int[] arr, int target, int start, int end ) {

        while (start <= end){

            int mid = start + (end - start) / 2;

            if (arr[mid] > target){
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }else {
                return mid;
            }
        }

        return -1;
    }
}
