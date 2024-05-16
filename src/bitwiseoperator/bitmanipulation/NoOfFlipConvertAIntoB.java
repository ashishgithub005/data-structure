package bitwiseoperator.bitmanipulation;

public class NoOfFlipConvertAIntoB {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 7;

        int a = 5;
        int b = 1;
        //int res = noOfFlip(a, b);
        //System.out.println(res);
        int res = noOfFlipUsingBruteForce(a, b);
        System.out.println(res);
    }

    private static int noOfFlipUsingBruteForce(int a, int b){
        int count = 0;
        while(a != 0 || b != 0){
            if((a & 1) != (b & 1))  count++;

            a = a >> 1;
            b = b >> 1;
        }

        return count;
    }

    private static int noOfFlip(int a, int b) {
        int c = a ^ b;

        return countSetBit(c);
    }

    //this is best algo to find no of set bit in a number
    private static int countSetBit(int c){
        int count = 0;
        while(c > 0){
            int res = c & -c;
            c = c - res;
            count++;
        }

        return count;
    }
}
