package recursion;

public class NatSqrSum {
    public static void main(String[] args) {
        int n = 5;
        int sum = natSqrSum(n);
        System.out.print(sum);
    }

    private static int natSqrSum(int n) {
        if(n == 1) return 1;

        return n*n + natSqrSum(n-1);
    }
}
