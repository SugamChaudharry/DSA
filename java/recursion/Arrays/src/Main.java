import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6,7,8,9};
        System.out.println(sorted(arr , 0));
        System.out.println(linearSearch(arr, 10, 0));
        ArrayList<Integer> list = new ArrayList<>(2);
        System.out.println(allIndex(arr,4,0,list));

        int[] a = {4,6,7,8,9,1,2,3};
        System.out.println(rotatedArray(a,3,0,a.length-1));

        trianglePattern(4,1);
        normalTrianglePattern(1,1);
    }

    static boolean sorted(int[] arr, int i){
        if(arr[i] > arr[i+1]) return false;
        if (i == arr.length - 2) return true;

        return sorted(arr, ++i);

    }

    static int linearSearch(int[] arr, int t , int i ){
        if(arr[i] == t ) return i;
        if (i >= arr.length -1) return -1;

        return linearSearch(arr, t ,++i);
    }

    static ArrayList<Integer> allIndex(int [] arr , int t, int i, ArrayList<Integer> res){
        if(arr[i] == t ) res.add(i) ;
        if (i == arr.length -1) return res;

        return allIndex(arr, t ,++i, res);
    }

    static int rotatedArray(int[] arr, int t, int s, int e) {
        int m = s + (e -s)/2;
        if ( arr[m] == t ) {
            return m;
        }
        if(arr[s] <= arr[m]){
            if (t <= arr[m] && t >= arr[s]) {
                e = m-1;
            }else{
                s = m+1;
            }
        }
        if ( t >= arr[m] && t <= arr[e] ) {
            s = m+1;
        }
        return rotatedArray(arr,t,s,e);
    }

    static void trianglePattern(int r ,int c){
            if (r == 0){
                return;
            }
            if (r > c){
                System.out.print("* ");
                trianglePattern(r,++c);
            }else {
                System.out.println("* ");
                trianglePattern(--r,1);
            }
    }
    static void normalTrianglePattern(int r ,int c){
            if (r == 4){
                return;
            }
            if (r >= c){
                System.out.print("* ");
                normalTrianglePattern(r,++c);
            }else {
                System.out.println("* ");
                normalTrianglePattern(++r,1);
            }
    }

}