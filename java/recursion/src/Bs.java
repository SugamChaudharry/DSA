public class Bs {
    public static void main(String[] args) {
        int [] arr = {1,23,34,444,5555,6788};
        System.out.println(bs(5555, arr,0,arr.length));
    }

    static int bs (int t, int[] arr, int s,int e){

        if(s>e)return -1;

        int m = s + (e-s)/2;
        if( arr[m] == t){
            return m;
        }
        if( t < arr[m] ){
            return bs(t,arr,s,m-1);
        }else {
            return bs(t,arr,m+1,e);
        }

    }
}
