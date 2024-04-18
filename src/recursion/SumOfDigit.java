package recursion;

public class SumOfDigit {
    public static void main(String[] args) {
        int num = 12;
        int res = sumOfDigitNum(num);
        System.out.println(res);
    }

    private static int sumOfDigitNum(int num) {
        if(num == 0) return 0;

        return num % 10 + sumOfDigitNum(num / 10);
    }
}
