import java.util.Scanner;

public class q23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n/2; i++) {
            if(n%i ==0 ){
                System.out.print(i+" ");
            }
        }
    }
}
