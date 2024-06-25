import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        for (int i = 0; i < arr.length ; i++) {
            int litem = 0;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[litem] < arr[j]){
                    litem = j;
                }
            }
            int temp = arr[litem];
            arr[litem] = arr[arr.length - 1  - i];
            arr[arr.length - 1  - i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

}
