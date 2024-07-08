import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        byLoop(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {5, 4, 3, 2, 1};
        byRecursion(arr2, arr2.length-1, 0);
        System.out.println(Arrays.toString(arr2));
    }

    static void byLoop(int [] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int s = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    s = 1;
                }
            }
            if (s != 1) {
                break;
            }
        }
    }

    static void byRecursion(int[] arr, int i, int j){
        if(i == 0) {
            return;
        }
        if (i  == j){
            byRecursion(arr,i-1,0);
        }
        else if(arr[j] > arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
            byRecursion(arr,i,++j);
        }
    }
}