package bitwiseoperator.bitmanipulation;

public class FindUniqueNumber {
    public static void main(String[] args) {
        int[] a = {1,1,2,5,2,4,4};
        int res = findUniqueNumber(a);
        System.out.println(res);
    }

    // n xor 0 = n
    // n ^ n = 0
    private static int findUniqueNumber(int[] a) {
       int xor = 0;
       for(int x : a){
        xor = xor ^ x;
       }

       return xor;
    }
    
}
