import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,2,1,3};

        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else {
                    break;
                }
            }
        }
        return arr;
    }
//    static int[] byRecursion(int [] arr){
//
//    }
}
