import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        /*
        n = input = 216468463565246  // output 6 = 5 times
        loop n.index[0 , -1 ]
        if n.index == 6
          no_6 += 1
         */
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int num = input.nextInt();
        System.out.println("what you want to count");
        int a = input.nextInt();
         int count = 0;
         while (num > 0){
             int rem = num % 10;
             if (rem == a){
                 count++;
             }
             num /= 10;
         }
        System.out.println(count);

    }
}
