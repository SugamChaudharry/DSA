import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
//        3. Write a program to input principal, time, and rate (P, T, R) from the user and
//        find Simple Interest.
        Scanner input = new Scanner(System.in);
        System.out.print("enter princpal ammount :");
        int p = input.nextInt();
        System.out.print("enter rate :");
        int r = input.nextInt();
        System.out.print("enter time :");
        int t = input.nextInt();
        System.out.print("simple intrest = ");
        System.out.print((p * r * t  / 100));

    }
}
