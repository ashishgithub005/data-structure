package recursion.array;

public class MinElement {
    public static void main(String[] args) {
        int[] a = {5,1,4,7,6,2,9, -1};
        int min1 = findMinElement1(a, a.length-1);
        System.out.println(min1);
    }

    private static int findMinElement1(int[] a, int n) {
        //Base Condition
        if(n == 0) return a[0];

        return Math.min(a[n], findMinElement1(a, n-1));
    }
}
