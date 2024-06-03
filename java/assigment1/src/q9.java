import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int copy = num;
        int strongNum = 0;
        while (copy != 0){
            strongNum += (int) Math.pow((copy%10), String.valueOf(num).length() );
            copy = copy / 10;
        }
        System.out.println(strongNum);
        if (num == strongNum) {
            System.out.println("ArmStrong number");
        }else {
            System.out.println("not a Armstrong number");
        }
    }
}
