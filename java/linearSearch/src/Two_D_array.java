import java.util.Arrays;
import java.util.Scanner;

public class Two_D_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = input.nextInt();

        System.out.println(Arrays.toString(linearSearch_2D(arr, target)));
    }

    private static int[] linearSearch_2D(int[][] arr, int target) {
        if (arr.length == 0) return new int[]{-1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{-1};
    }
}
