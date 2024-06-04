import java.util.Scanner;

public class inrange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {1,2,3,4,5,9,8,7,6,};
        int target = input.nextInt();

        System.out.println(  linearSearchInRange(arr, target, 4, 8)  );
    }

    static int linearSearchInRange(int[] arr, int tar, int start, int end  ) {
        if (arr.length == 0) return -1;

        for (int i = start; i < end; i++) {
            if (tar == arr[i]) {
                return i;
            }
        }

        return -1;
    }
}
