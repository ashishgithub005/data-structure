package recursion.simple.problem;

public class PrintPolynomial {
    public static void main(String[] args) {
        int n = 5;
        String var = "x";
        printPolynomial(var, n);
    }

    private static void printPolynomial(String x, int n) {
        if(n == 0) {
            System.out.print("1");
            return;
        };
        System.out.print(x+"^"+n+" + ");
        printPolynomial(x, n-1);
    }
}
