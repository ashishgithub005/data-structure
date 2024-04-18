package recursion.leetcode;

public class PowerOfFour {
    public static void main(String[] args) {
        int n = 2;
        //int divisor = 2;
        //boolean res = isPowerOfFour(n, divisor);
        System.out.println(2/2);
    }

    private static boolean isPowerOfFour(int n, int divisor) {
        if(n==1){
            return true;
        }
        if(n % divisor!=0 || n==0) {
            return false;
        }
        return isPowerOfFour(n/divisor, divisor);
    }
}
