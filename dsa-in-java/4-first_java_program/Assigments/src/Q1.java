import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
//        1. Write a program to print whether a number is even or odd, also take
//        input from the user.
//        Example 1: Check whether a number is even or odd using if...else statement
        Scanner input = new Scanner(System.in);
        System.out.print("plz enter the number :");
        int num1 = input.nextInt();

        if (num1 % 2 == 0)
            System.out.println(num1 + " is even");
        else
            System.out.println(num1 + " is odd");


    }
}
