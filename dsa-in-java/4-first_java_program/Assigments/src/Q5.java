import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
//        5. Take 2 numbers as input and print the largest number.
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number for comorasition :");
        int num1 = input.nextInt();
        System.out.print("enter the number for comorasition :");
        int num2 = input.nextInt();
        System.out.print(Math.max(num1, num2));
    }
}
