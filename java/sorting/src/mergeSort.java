import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
    int[] arr = {9,8,7,6,5,4,3,2,1};
    sort(arr);
        for (int j : arr) {
            System.out.println(j + " ");
        }
    }
    static void sort(int[] arr){
        int len = arr.length;
        if (len <= 1)return;

        int m = len/2;
        int[] lArr = new int[m];
        int[] rArr = new int[len-m];
        int i = 0;
        int j = 0;

        while (i < len) {
            if(i<m){
                lArr[i] = arr[i];
                i++;
            }else {
                rArr[j] = arr[i];
                j++;
            }
        }
        sort(lArr);
        sort(rArr);
        merge(lArr,rArr,arr);
    }
    static void merge(int[] lArr, int[] rArr, int[] arr){
        System.out.println(Arrays.toString(lArr));
        System.out.println(Arrays.toString(rArr));
        System.out.println(Arrays.toString(arr));
    }
}
