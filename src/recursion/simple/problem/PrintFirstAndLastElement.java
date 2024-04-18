package recursion.simple.problem;
//Write a recursive function to print an array in the following order. [0] [n-1] [1] [n-2] ......... ......... [(n-1)/2] [n/2]
//Input:
//        5
//        1 5 7 8 9
//Output:
//        1 9
//        5 8
//        7 7
public class PrintFirstAndLastElement {
    public static void main(String[] args) {
        //int[] a = {1, 5, 7, 8, 9};
        int[] a = {1, 5, 7, 8, 9};
        print(a, 0, a.length-1);
    }

    private static void print(int[] a, int i, int n) {
        if(i > n) return;
        System.out.println(a[i]+" "+a[n]);
        print(a, i+1, n-1);
    }
}
