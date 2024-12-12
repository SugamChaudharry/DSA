import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap to store student names and their grades
        HashMap<String, Integer> map = new HashMap<>();
        Scanner input = new Scanner(System.in);
// Add five student records
        map.put("Alice", 85);
        map.put("Bob", 90);
        map.put("Charlie", 75);
        map.put("David", 88);
        map.put("Eve", 92);

        String s = input.next();
        System.out.println(map);
        map.forEach(( k, v) -> {
            if(k.equals(s)){
            System.out.println(k + " = " + v);
            }
        });

        if(map.containsKey(s)){
            int i = input.nextInt();
            map.replace(s, i);
        }
        System.out.println(map);

        String ss = input.next();
        if(map.containsKey(ss)){
            map.remove(ss);
        };
        System.out.println(map);


    }
}