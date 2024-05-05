package bitwiseoperator.bitmanipulation;

public class CountNoOfFlipToTransformAandBIntoC {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        int res = noOfFlip(a, b, c);
        System.out.println("no of flip to transform and b to reach c : "+res);
    }

    private static int noOfFlip(int a, int b, int c) {
        int res1 = ((a|b) ^ c);
        int res2 = a & b;
        int res3 = res1 & res2; //find no of flip if both a and b contain ith bit is 1.

        return countSetBit(res1) + countSetBit(res3);
    }

    private static int countSetBit(int n){
        int count = 0;
        while(n > 0){
            //find right most set bit
            int x = (n & -n);
            //clear right most set bit
            n = n - x;
            count++;
        }

        return count;
    }
    
}
