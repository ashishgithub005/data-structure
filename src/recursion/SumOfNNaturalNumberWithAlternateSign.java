package recursion;
//Ex: n = 5, sum = 1 - 2 + 3 - 4 + 5 o/p = 3
//  n = 10, o/p = -5
public class SumOfNNaturalNumberWithAlternateSign {
    public static void main(String[] args) {
        int n = 10;
        int res = sumOfNaturalNum(n);
        System.out.println(res);
    }

    private static int sumOfNaturalNum(int n) {
        if(n == 0) return 0;

        if(n % 2 == 0){
            return sumOfNaturalNum(n-1) - n;
        }else{
            return sumOfNaturalNum(n-1) + n;
        }
    }
}
