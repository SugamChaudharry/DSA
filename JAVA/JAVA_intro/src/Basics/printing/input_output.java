package Basics.printing;

import java.util.Scanner;

public class input_output {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(input.nextLine());

        System.out.println("plzz enter some inputs :- ");
        int rollNo = input.nextInt();
        System.out.println("your roll number is : " + rollNo);
    }
}
