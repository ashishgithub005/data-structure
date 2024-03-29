package recursion.type.of.recursion;

public class RegularRecursion {
    public static void main(String[] args) {
        int n = 3;
        regularRecursionDemo(n);
    }

    private static void regularRecursionDemo(int n) {
        if(n > 0){
            regularRecursionDemo(n-1);
            System.out.print(n+" ");
            regularRecursionDemo(n-1);
        }
    }
}
