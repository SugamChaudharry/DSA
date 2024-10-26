import java.util.Arrays;

public class slidingSum {
    public static void main(String[] args) {
        int[] arr = {-1,4,5,-3,2,4,-6,7,9,-11};
        int k = 3;
        int[] ans = new int[arr.length];
        int i = 0;
        while(i<arr.length-2){
            ans[i] = arr[i]+arr[i+1]+arr[i+2];
            i++;
        }
//        for(int i = 0;; i++ ){
//        }
        k = ans[0];
        for(int j = 1; j<ans.length; j++){
            if(ans[j] > k){
                k=ans[j];
            }
        }
        System.out.println(Arrays.toString(ans));
        System.out.println(k);
    }
}
