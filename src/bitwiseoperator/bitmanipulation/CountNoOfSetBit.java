package bitwiseoperator.bitmanipulation;

public class CountNoOfSetBit {
    public static void main(String[] args) {
        int n = 7;
        int setBitCount = countNoOfSetBit(n);
        System.out.println(setBitCount);
    }

    private static int countNoOfSetBit(int n) {
        int count = 0;
         //int have 32 bit size, so here we are iterating 32 times.
         for(int i =0;i<32;i++){
             if((n & (1 << i)) > 0) count++;
         }

        return count;
    }

    //this is more optimized than above.
    private static int kernighanALgo(int n){
        int count = 0;
        while(n > 0){
            int rmsb = n & -n;
            n = n - rmsb;
            count++;
        }

        return count;
    }
}
