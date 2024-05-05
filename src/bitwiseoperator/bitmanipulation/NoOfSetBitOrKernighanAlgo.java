package bitwiseoperator.bitmanipulation;

public class NoOfSetBitOrKernighanAlgo {
    public static void main(String[] args) {
        int n = 22;
        int res = noOfSetBit(n);
        System.out.println(res);
        int res1 = kernighanAlgo(n);
        System.out.println(res1);
    }

    //brute force method
    private static int noOfSetBit(int n) {
       int count = 0;
       while(n > 0){
           count +=n&1;
           n = n>>1; //right shift means divide by 2
       }

       return count;
    }

    private static int kernighanAlgo(int n){
        int count = 0;
        while(n > 0){
            int rmsb = (n & -n); //find rmsb
            n = n - rmsb; //clear rmsb
            count++;
        }
        
        return count;
    }

}

