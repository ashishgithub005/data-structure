package recursion;

public class CountDigit {
    public static void main(String[] args) {
        int num = 1234;
        int res = countDigit(num, 0);
        System.out.println(res);
    }

    private static int countDigit(int num, int count) {
        if(num == 0) return count;

        return countDigit(num/10, count + 1);
    }
}
