import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

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
        System.out.println(Arrays.toString(arr));
    }

}