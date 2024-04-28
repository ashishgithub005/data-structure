package number.system;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        int n = 13;
        int binNum1 = decToBin(n);
        System.out.println(binNum1);
        int binNum2 = decToBinM2(n);
        System.out.println(binNum2);
    }

    private static int decToBin(int n) {
        StringBuilder ans = new StringBuilder();
        while(n > 0){
            int rem = n % 2;
            ans.append(rem);
            n = n/2;
        }

        return Integer.parseInt(ans.reverse().toString());
    }
    private static int decToBinM2(int n) {
        int binNum = 0;
        int pow = 1; // 10^0 = 1;

        while(n > 0){
            int lastDigit = n % 2;
            binNum += lastDigit * pow;
            pow *=10;
            n /=2;
        }

        return binNum;
    }
}
