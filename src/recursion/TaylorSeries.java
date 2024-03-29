package recursion;

public class TaylorSeries {
    public static void main(String[] args) {
        int sum = taylorSeries(3, 10, 1, 1);
        System.out.println(sum);
    }

    private static int taylorSeries(int x, int n, int p, int f) {
        if(n==0) return 1;
        int r = taylorSeries(x, n-1, p, f);
        p = p*x;
        f = f*n;
        return  r+p/f;

    }
}
