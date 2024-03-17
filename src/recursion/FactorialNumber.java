package recursion;

public class FactorialNumber {
    public static void main(String[] args) {
        int n = 5;
        int fact = factNum(n);
        System.out.print(fact);
    }

    private static int factNum(int n) {
        if(n == 0) return 1;

        return n * factNum(n-1);
    }
}
