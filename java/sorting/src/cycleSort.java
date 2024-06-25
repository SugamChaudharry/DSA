import java.util.Arrays;

public class cycleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        for (int i = 0; i < arr.length;) {
            if(arr[i] == i+1){
                i++;
            }else {
                int temp = arr[i];
                arr[i] = arr[arr[i] - 1];
                arr[temp - 1] = temp;
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}
