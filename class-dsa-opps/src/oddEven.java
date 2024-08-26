import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean f = true;
        for(int i = 1 ; i*i <= num;i++){
            if(i*i == num){
                System.out.println(i);
                f = false;
                break;
            }
        }
        if(f){
            System.out.println(-1);
        }

    }
}



