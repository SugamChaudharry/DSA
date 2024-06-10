import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
//        p1(size);
        p2(size);
    }

    static void p1(int s){
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                if (j == 0 || j == s-1){
                    System.out.print(" * ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void p2(int s){
        int l = s - 2;
        int f = 1;
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                if (j == 0 || j == s-1){
                    System.out.print(" * ");
                } else {
                    if ( i <= s/2 && i != 0 ) {
                        if (i == f && j == f) {
                            System.out.print("&");
                            f++;
                        } else if (i == f-1 && j == l) {
                            System.out.print("&");
                            l--;
                        }else {
                            System.out.print(" ");

                        }
                    }else {
                        System.out.print(" ");

                    }
                }
            }
            System.out.println();
        }
    }
}
