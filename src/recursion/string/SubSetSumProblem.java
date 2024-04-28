package recursion.string;

public class SubSetSumProblem {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int tempSum = 0;
        subsetSum(a,a.length-1, tempSum);
    }

    private static void subsetSum(int[] a, int n, int tempSum) {
        if(n == -1) {
            System.out.println(tempSum);
            return;
        }
        //exclude current num
        subsetSum(a, n-1, tempSum);
        //include current num
        int currentNum = a[n];
        subsetSum(a,n-1, tempSum + currentNum);
    }
}
