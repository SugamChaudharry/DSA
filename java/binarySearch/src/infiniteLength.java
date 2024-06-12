import java.util.Arrays;
import java.util.Scanner;

public class infiniteLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of arr : ");

        int size = input.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements of arrays : ");

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        boolean stop = false;

        do {
            System.out.println("what element you want to find : ");
            int target = input.nextInt();

            System.out.println(Arrays.toString(arr));
            System.out.print(" ");

            int ind = ans(arr,target);

            char[] sb = {'^','|'};
            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j <= ind; j++) {
                    if (j == ind && i < 2) {
                        System.out.print(sb[i]);
                    }else {
                        if (j == ind){
                            System.out.print(ind);
                        }else {
                            if (i == 2) {
                                System.out.print(j);
                                System.out.print("  ");
                            }else {
                                System.out.print("   ");
                            }
                        }
                    }

                }
                System.out.println();
                System.out.print(" ");
            }
            System.out.print("Do you want to continue [y/n] : ");
            char f = input.next().trim().charAt(0);
            if (f != 'y'){
                stop = true;
            }
        }while (!stop);
    }

    static  int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while (target > arr[end]){
            int temp = end + 1;
            end = end + (start + (end - start)/2)*2;
            start = temp;
        }
        return binarySearch(arr , target, start, end);
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
