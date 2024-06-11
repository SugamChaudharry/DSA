import java.util.Arrays;
import java.util.Scanner;

public class floor {
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
            int ind = binarySearch(arr,target);
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

    static int binarySearch(int[] arr , int target) {
        int start = 0;
        int end = arr.length-1;
        int mid = start + (end - start) / 2;

        boolean isAsc = arr[0] < arr[1];

        while (start <= end){
            mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {
                if (arr[mid] > target){
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                }
            }else {
                if (arr[mid] > target){
                    start = mid + 1;
                } else if (arr[mid] < target) {
                    end = mid - 1;
                }
            }

        }

        return  end  ;
    }
}
