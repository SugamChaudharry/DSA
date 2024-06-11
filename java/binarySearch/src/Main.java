import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int[] ar = {9,8,7,6,5,4,3,2,1,0,-1,-2,-3,-4};
        int target = input.nextInt();

        System.out.println(binarySearch_Ascending(arr, target));
        System.out.println(binarySearch_Descending(ar, target));



    }

    static int binarySearch_Descending(int[] ar, int target) {
        int start = 0;
        int end = ar.length-1;

        while (start <= end){

            int mid = start + (end - start) / 2;

            if (ar[mid] > target){
                start = mid + 1;
            } else if (ar[mid] < target) {
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    static int binarySearch_Ascending(int[] arr , int target) {
        int start = 0;
        int end = arr.length-1;

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