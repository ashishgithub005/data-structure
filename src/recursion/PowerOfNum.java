package recursion;

public class PowerOfNum {
    public static void main(String[] args) {
        int num = 2;
        int n = 4;

        int power = powNum(num, n);
        System.out.print(power);
    }

    private static int powNum(int num, int n) {
        if(n == 1) return num;

        return num * powNum(num, n-1);
    }
}
