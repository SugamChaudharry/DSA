import java.util.HashMap;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        String ss = input.nextLine();

        if(s.length() == ss.length()){
            HashMap<Character, Integer> sh = new HashMap<>();
            HashMap<Character, Integer> ssh = new HashMap<>();

                for (int i = 0; i < s.length(); i++) {
                    if(sh.containsKey(s.charAt(i))){
                        sh.put(s.charAt(i) , sh.get(s.charAt(i))+1);
                    }else {
                        sh.put(s.charAt(i) , 1);
                    }
                    if(ssh.containsKey(ss.charAt(i))){
                        ssh.put(ss.charAt(i) , ssh.get(ss.charAt(i))+1);
                    }else {
                        ssh.put(ss.charAt(i) , 1);
                    }
                }
                int[] f = {0};
                sh.forEach((k , v) -> {
                    if(!v.equals(ssh.get(k))){
                        f[0] = 1;
                    }
                });
                if(f[0] == 1){
                    System.out.println("No");
                }else System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
