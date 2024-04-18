package recursion;

public class PrintMultipleOfNumUpToGivenNum {
    public static void main(String[] args) {
        int n = 3;
        int k = 8;
        printMultiNum(n, k);
    }

    private static void printMultiNum(int n, int k) {
        if(k == 0) return;

        printMultiNum(n, k-1);
        System.out.println(n * k);
    }
}
