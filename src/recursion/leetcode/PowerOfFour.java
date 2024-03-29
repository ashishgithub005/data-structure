package recursion.leetcode;

public class PowerOfFour {
    public static void main(String[] args) {
        int n = 25;
        boolean res = isPowerOfFour(n);
        System.out.println(res);
    }

    private static boolean isPowerOfFour(int n) {
        if(n == 1) return true;

        return isPowerOfFour(n/4);
    }

}
