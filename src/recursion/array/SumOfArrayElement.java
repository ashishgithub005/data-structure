package recursion.array;

public class SumOfArrayElement {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50,60,70,80};
        int sum = findSum(a, a.length-1);
        System.out.println(sum);
    }

    private static int findSum(int[] a, int n) {
        if(n == 0) return a[0];

        return a[n] + findSum(a, n-1);
    }
}
