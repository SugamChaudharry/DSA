import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        p*r*t
//        int p = 2;
//        int r = 4;
//        int t = 5;
//        System.out.println(p*r*t);
        Scanner input = new Scanner(System.in);
        int cgpaInCs = input.nextInt();

        if (cgpaInCs == 10){
            System.out.println("O");
        } else if (cgpaInCs <= 9 && cgpaInCs >= 7) {
            System.out.println("A+");
        } else if (cgpaInCs <= 7 && cgpaInCs >=5) {
            System.out.println("A");
        }else if (cgpaInCs <= 5 && cgpaInCs >=3) {
            System.out.println("B");
        } else{
            System.out.println("less then 4 cgpa no grade");
        }
    }
}
