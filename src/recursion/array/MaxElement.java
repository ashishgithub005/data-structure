package recursion.array;

public class MaxElement {
    public static void main(String[] args) {
        int[] a = {5,1,4,7,6,2,9};
        int max1 = findMaxElement1(a, a.length, 0);
        System.out.println(max1);
        int max2 = findMaxElement2(a, a.length-1);
        System.out.println(max2);
    }

    private static int findMaxElement1(int[] a, int n, int index) {
       if(index == n-1) return a[n-1];

       return Math.max(a[index], findMaxElement1(a, n, index+1));
    }

    //this is best approach because here less number of variable required.
    private static int findMaxElement2(int[] a, int n) {
        if(n == 0) return a[0];

        return Math.max(a[n], findMaxElement2(a, n-1));
    }
}
