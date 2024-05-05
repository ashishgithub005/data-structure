package bitwiseoperator.bitmanipulation;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 1;
        generatePowerOfTwo(n);
    }

    private static void generatePowerOfTwo(int n) {
        while(n <10){
            int pow = (1<<n);
            System.out.println(pow);
            n++;
        }

    }
}
