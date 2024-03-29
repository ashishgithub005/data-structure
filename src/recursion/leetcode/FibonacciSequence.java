package recursion.leetcode;

public class FibonacciSequence {
    public static void main(String[] args) {
        int n = 9;
        int res = fibo(n);
        System.out.println(res);
    }
    private static int fibo(int n) {

        if(n <=1){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }
}
