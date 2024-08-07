public class factorial {
    public static void main(String[] args) {
        System.out.println(fun(5));
        System.out.println(sumOfDigits(1234));

    }
    static int fun(int n){
        if(n == 1) return n;
        return n * fun(n-1);
    }
    static int sumOfDigits(int n){
        if(n == 1) return n;
        return (n%10) + sumOfDigits(n/10);
    }
}
