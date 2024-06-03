import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        System.out.print("0 1 ");
        for(int i = 2; i < n ; i++){
            int s = a+b;
            System.out.print(s + " ");
            a = b;
            b = s;
        }
    }
}
