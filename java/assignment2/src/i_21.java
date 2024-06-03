import java.util.Scanner;

public class i_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String vowels = "aeiou";
        int f = 0;
        char ch = input.next().trim().charAt(0);
        for (int i = 0; i < vowels.length(); i++) {
            if (ch == vowels.toUpperCase().charAt(i) || ch == vowels.charAt(i)) {
                System.out.println("Vowels");
                f = 1;
            }
        }
        if (f == 0){
            System.out.println("Consonant");
        }
    }
}
