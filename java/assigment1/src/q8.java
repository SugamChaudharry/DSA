import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        num_palindrome();
    }

    public static void num_palindrome() {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int copy = num;
        int rev = 0;

        while (copy != 0){
            rev = rev*10 + (copy%10);
            copy = copy / 10;
        }

        if (num == rev) {
            System.out.println("palindrome");
        }else {
            System.out.println("not a palindrome");
        }

    };
    public static void string_palindrome() {
      //TODO : complete function
    }

}
