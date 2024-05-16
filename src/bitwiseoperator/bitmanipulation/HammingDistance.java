package bitwiseoperator.bitmanipulation;

public class HammingDistance {
    public static void main(String[] args) {
        int x = 1;
        int y = 4;

        int res = findHammingDistance(x, y);
        System.out.println("hamming distance is : "+res);
    }

    private static int findHammingDistance(int x, int y) {
        int xor = x ^ y;

        return countSetBitInXor(xor);
    }

    private static int countSetBitInXor(int xor) {
        int count = 0;
        while(xor > 0){
            int rmsb = xor & -xor;
            xor = xor-rmsb;
            count++;
        }

        return count;
    }
}
