import java.util.Scanner;

public class max_min {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,9,8,7,6,};
        System.out.println(  linearSearchFor_max(arr)  );
        System.out.println(  linearSearchFor_min(arr)  );
    }

    static int linearSearchFor_max(int[] arr) {
        if (arr.length == 0) return -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
    static int linearSearchFor_min(int[] arr) {
        if (arr.length == 0) return -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
