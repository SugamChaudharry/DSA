import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        int me = input.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (me == arr[i]) {
                System.out.println("x"+i);
            }
        }

    }
}
