package recursion.type.of.recursion;

public class HeadRecursion {
    public static void main(String[] args) {
        int n = 3;
       // headRecursionDemo(n);
        headRecursionDemo1(n);
    }

    private static void headRecursionDemo(int n) {
        if(n > 0){
            headRecursionDemo(n-1);
            System.out.println(n);
        }
    }

    private static void headRecursionDemo1(int n) {
        if(n > 0){
            headRecursionDemo1(n-1);
            headRecursionDemo1(n-1);
            System.out.print(n+" ");
        }
    }


}
