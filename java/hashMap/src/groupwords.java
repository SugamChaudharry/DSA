import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class groupwords {
    public static void main(String[] args) {
        String[] s = {"bat", "tab", "rat", "tar", "art"};

        HashMap<String, ArrayList<String>> a = new HashMap<>();

        for (int i = 0; i < s.length; i++) {
             char[] ct = s[i].toCharArray();
             Arrays.sort(ct);
             String st = new String(ct);
             if(a.containsKey(st)){
                 ArrayList<String> sst = a.get(st);
                 sst.add(s[i]);
                 a.put(st , sst );
             }else {
                 ArrayList<String> sst = new ArrayList<>();
                 sst.add(s[i]);
                 a.put(st , sst );
             }
        }
        System.out.println(a);

    }
}
