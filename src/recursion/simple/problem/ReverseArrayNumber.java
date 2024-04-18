package recursion.simple.problem;
//You will be given an array of integers, write a recursive solution to print it in reverse order.
//        Input:
//        5
//        69 87 45 21 47
//Output:
//        47 21 45 87 69
public class ReverseArrayNumber {
    public static void main(String[] args) {
        int[] a = {69, 87, 45, 21, 47};
        printReverseOrder(a, a.length-1);
    }

    private static void printReverseOrder(int[] a, int n) {
        if(n == -1) return;
        System.out.println(a[n]);
        printReverseOrder(a, n-1);
    }
}
