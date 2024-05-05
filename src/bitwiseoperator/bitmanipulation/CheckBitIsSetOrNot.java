package bitwiseoperator.bitmanipulation;

public class CheckBitIsSetOrNot {
    public static void main(String[] args) {
        int n = 8;
        checkBitNature(n);
    }

    private static void checkBitNature(int n) {
        while(n != 0){
            if((n & 1) == 1)
                System.out.println("bit is set");
            else
                System.out.println("bit is not set");
            n = n >> 1;
        }
    }
}
