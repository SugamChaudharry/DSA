import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num%2==0) {
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
}
}
