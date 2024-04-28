package bitwiseoperator.bitmanipulation;

public class RightMostSetBit {
    public static void main(String[] args) {
        int n =18;
        int res = findRMSB(n);
        System.out.println(res);

        int res2 = findRMSBM2(n);
        System.out.println(res2);
    }

    private static int findRMSB(int n) {

        return n & -n;
    }

    private static int findRMSBM2(int n) {

        return n & ~(n-1);
    }
}
