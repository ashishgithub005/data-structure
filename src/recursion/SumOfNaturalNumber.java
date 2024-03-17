package recursion;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        int n = 5;
        int sum = naturalSum(n);
        System.out.print("sum of n natural number : "+sum);
    }

    private static int naturalSum(int n) {
        if(n == 0) return 0;

        return n + naturalSum(n-1);
    }
}
