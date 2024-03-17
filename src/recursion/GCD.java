package recursion;

public class GCD {
    public static void main(String[] args) {
        int a = 18;
        int b = 48;
        int res = gcd(a, b);
        System.out.print(res);
    }

    private static int gcd(int a, int b) {
        if(b == 0) return a;

        return gcd(b, a%b);
    }
}
