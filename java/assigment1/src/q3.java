import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter p, r, t :");
        int p = input.nextInt();
        int t = input.nextInt();
        int r = input.nextInt();
        System.out.println((p*r*t)/100);
    }
}
