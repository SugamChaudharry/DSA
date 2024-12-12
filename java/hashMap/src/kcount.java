import java.util.ArrayList;
import java.util.HashMap;

public class kcount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        ArrayList<Integer> res = new ArrayList<>();
        int k = 4;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i+k-1 < arr.length; i++) {
            map.clear();
            for (int j = i; j <= i+k-1; j++) {
                if(!map.containsKey(arr[j])){
                    map.put(arr[j] , 1);
                }
            }
            res.add(map.size());
        }
        System.out.println(res);
    }
}
