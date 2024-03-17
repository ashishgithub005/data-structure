package recursion.array;

public class PrintArrayElement {
    public static void main(String[] args) {
        int[] a = {5,1,4,7,6,2,9};
        printElement1(a, a.length, 0);
        System.out.println();
        printElement2(a, a.length-1);
    }

    private static void printElement1(int[] a, int n, int index) {
        if(index == n) return;
        System.out.print(a[index]+" ");
        printElement1(a, n, index +1);
    }
    private static void printElement2(int[] a, int n) {
        if(n == -1) return;
        printElement2(a, n-1);
        System.out.print(a[n]+" ");
    }
}
