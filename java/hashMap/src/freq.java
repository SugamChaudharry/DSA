import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class freq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i< s.length(); i++){
            if( map.containsKey( s.charAt(i) ) ){
                map.put(s.charAt(i) , map.get(s.charAt(i)) + 1);
            }else {
                map.put(s.charAt(i) , 1);
            }
        }
        System.out.println(map);

        HashMap<String, Integer> word = new HashMap<>();

        String[] words = s.split(" ");
        System.out.println(s);
        System.out.println(Arrays.toString(words));
        for (int i = 0; i< words.length; i++){
            if(word.containsKey(words[i])){
                word.put(words[i] , word.get(words[i]) + 1);
            }else {
                word.put(words[i] , 1);
            }
        }
        System.out.println(word);

    }
}
