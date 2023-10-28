public class sdf {
        public int subtractProductAndSum(int n) {
            int sum = 0;
            int mul = 1;
            String ns = Integer.toString(n);
            for(int i = 0 ; i < ns.length() ; i++){
                int degit = Character.getNumericValue(ns.charAt(i));
                sum += degit;
                mul *= degit;
            }
            int out = sum - mul ;
            return out;
        }
}
