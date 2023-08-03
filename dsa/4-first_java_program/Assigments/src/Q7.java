import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
//        7. To calculate Fibonacci Series up to n numbers.
//        char ch = in.next().trim().charAt(0);
//       sol. all numbers
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int c;
        for (int run = 2; run != n; run += 1, a = b, b = c ) {
            c = a + b;
            System.out.print(c + ",");
        }
//            sol. for only answer
// Scanner input = new Scanner(System.in);
//             int n = input.nextInt();
//             int a = 0;
//             int b = 1;
//             System.out.println(a);
//             System.out.println(b);
//             int c;
//             int q = 0;
//             for (int run = 2; run <= n; run += 1, a = b, b = c ) {
//                 c = a + b;
//                 q = c;
//             }
//             System.out.print(q);
//         }
    }





}
