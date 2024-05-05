package bitwiseoperator.bitmanipulation;

public class CountZeroAndOneInBinaryOfNumber {
    public static void main(String[] args) {
        int n = 15;
        countOneNadZero(n);
    }

    private static void countOneNadZero(int n) {
        int zeroCount = 0;
        int oneCount = 0;
        for(int i=0;i<n;i++){
            if((n & (1<<i)) > 0){
                oneCount++;
            }else{
                zeroCount++;
            }
        }

        System.out.println("zeroCount count : "+zeroCount);
        System.out.println("oneCount count : "+oneCount);
    }
}
