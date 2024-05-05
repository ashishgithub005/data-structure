package bitwiseoperator.bitmanipulation;

public class IsPowerOfTwo {
    public static void main(String[] args) {
        int n = 9;
        boolean res = checkIsPowerOf2(n);
        System.out.println(res);
    }

    private static boolean checkIsPowerOf2(int n) {
       if(n == 0) return false;

       return (n &(n-1)) == 0;
    }
    
}
