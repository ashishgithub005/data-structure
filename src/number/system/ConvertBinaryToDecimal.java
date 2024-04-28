package number.system;

public class ConvertBinaryToDecimal {
    public static void main(String[] args) {
        int n = 1101;
        int decNum1 = binaryToDec(n);
        int decNum2 = binaryToDecM2(n);
        System.out.println(decNum1);
        System.out.println(decNum2);
    }

    private static int binaryToDec(int n) {
        int decNum = 0;
        int pow = 0;
        while(n > 0){
            int lastDigit = n % 10;
            decNum += (int) (lastDigit * Math.pow(2, pow++));
            n = n/10;
        }

        return decNum;
    }

    private static int binaryToDecM2(int n) {
        int decNum = 0;
        int pow = 1; //10^0 = 1
        while(n > 0){
            int lastDigit = n % 10;
            decNum += lastDigit * pow;
            pow *=2;
            n = n/10;
        }

        return decNum;
    }
}
