import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //  for numbers
        int[] nums = {1,2,34,4565,8,9,8,56,5443,32,43,5465,67,54,3,12,32,54,56,7,67,56,54,4,32,12,3,};
        int target = input.nextInt();

        System.out.println(  linearSearch(nums,target)  );

        // for string
        String str = "sugam chaudhary";
        char tar = input.next().trim().charAt(0);

        System.out.println(  linearSearch(str,tar)  );

    }

    // search in the array return index if item found else -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }

        return -1;
    }
    static boolean linearSearch(String str, int target) {
        if (str.isEmpty()) return false;

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }

        return false;
    }
}