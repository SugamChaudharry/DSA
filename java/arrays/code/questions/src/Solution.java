import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateMatrix(3)));
    }
    static int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int r = 0;
        int c = 0;
        for (int i = 1; i<= n*n; i++){
            if (c == n){
                c = 0;
                r++;
            }else{

                ans[r][c] = i;
                c++;
            }
        }
        return ans;
    }
}