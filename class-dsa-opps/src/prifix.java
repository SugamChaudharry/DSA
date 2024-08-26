import java.util.Arrays;
import java.util.Scanner;

public class prifix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[] arr = new int[len];
        int[] res = new int[len];
        for(int i = 0; i<len;i++){
            arr[i] = input.nextInt();
        }
        res[0] = arr[0];
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i<len;i++){
            res[i] = res[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(res));
    }
}
