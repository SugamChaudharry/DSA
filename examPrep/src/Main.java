public class Main {
    public static void main(String[] args) {
//        PalindromicString("ababababa");
    }

    public static void PalindromicString(String s){
        int f = 1;
        for (int i = 0; i < s.length() / 2; i++) {
            if( s.charAt(i) != s.charAt(s.length()-1+i ) ){
                f = 0;
            }
        }
        if(f==1) System.out.println("YES");
        else System.out.println("NO");
    }
}