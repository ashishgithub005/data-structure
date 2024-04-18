package recursion;

public class PowerOfNum {
    public static void main(String[] args) {
        int num = 2;
        int n = 4;

        //int res = powNum(num, n);
        int res = optimisedPowNum(num, n);
        System.out.print(res);
    }

    //TC = O(n), SC = O(n)
    private static int powNum(int num, int n) {
        if(n == 1) return num;

        return num * powNum(num, n-1);
    }

    //TC = O(log n), SC = O(n)
    private static int optimisedPowNum(int p, int n) {
        if(n == 0) return 1;

        int smallPow = optimisedPowNum(p, n/2);
        if(n % 2 == 0){
            return smallPow * smallPow;
        }else{
            return p * smallPow * smallPow;
        }
    }
}
