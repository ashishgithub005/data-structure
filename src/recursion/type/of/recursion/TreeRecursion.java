package recursion.type.of.recursion;

public class TreeRecursion {
    public static void main(String[] args) {
        int n = 3;
        treeRecursionDemo(n);
    }

    private static void treeRecursionDemo(int n) {
        if(n > 0){
            System.out.print(n+" ");
            treeRecursionDemo(n-1);
            treeRecursionDemo(n-1);
        }
    }
}
