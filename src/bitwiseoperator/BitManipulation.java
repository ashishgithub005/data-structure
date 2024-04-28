package bitwiseoperator;
/*
* you are given a number n
* print number produced by setting(ON) ith bit.
* print number produced by unsetting(OFF) jth bit.
* print number produced by toggling kth bit.
* check mth bit is ON or OFF.
* */
public class BitManipulation {
    public static void main(String[] args) {
        //810 => 1100101010
        //850 => 1101010010
        int n = 810;
        setBitIthPosition(n, 3);
        unSetBitJthPosition(n, 4);
        toggleBitKthPosition(n, 3);
        checkOnOrOffBitOnMthPositionBit(n, 3);
    }

    private static void setBitIthPosition(int n, int i) {
        int onMask = (1 << i);
        System.out.println(n | onMask);
    }
    private static void unSetBitJthPosition(int n, int j) {
        int offMask = ~(1 << j);
        System.out.println(n & offMask);
    }
    private static void toggleBitKthPosition(int n, int k) {
        int toggleMask = (1 << k);
        System.out.println(n ^ toggleMask);
    }
    private static void checkOnOrOffBitOnMthPositionBit(int n, int m) {
        int checkMask = (1 << m);
        System.out.println((n & checkMask) == 0 ? "OFF" : "ON");
    }
}
