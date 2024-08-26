import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        int copy = num;
//        int rev = 0;
//        while (copy != 0){
//            int lastDig = copy%10;
//            rev = (rev*10)+lastDig;
//            copy = copy/10;
//        }
//        System.out.println(rev);
        int a = 4;
        int b = 5;
        a = b^a;
        b = a^b;
        a = a^b;
        System.out.println(a);
        System.out.println(b);

    }
}
