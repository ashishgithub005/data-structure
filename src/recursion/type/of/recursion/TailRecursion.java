package recursion.type.of.recursion;

public class TailRecursion {
    public static void main(String[] args) {
       int n =5;
       fun(n);
    }

    private static void fun(int n) {
        if(n > 0){
            System.out.println(n);
            fun(n-1);
        }
    }
}
