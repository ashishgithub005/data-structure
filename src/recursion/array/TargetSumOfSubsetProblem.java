package recursion.array;

import java.util.ArrayList;
import java.util.List;

public class TargetSumOfSubsetProblem {
    public static void main(String[] args) {
        int[] a = {3,6,5,4};
        List<Integer> sums = new ArrayList<>();
        int targetSum = 12;
        int tempSum = 0;
        targetSumOfSubset(a, a.length-1, tempSum,targetSum, sums);
        System.out.println(sums);

    }

    private static void targetSumOfSubset(int[] a, int n, int tempSum, int targetSum, List<Integer> sums) {
        if(n == -1 || tempSum == targetSum){

            return;
        }
        //ignore
        targetSumOfSubset(a, n-1, tempSum, targetSum, sums);
        //accept
        targetSumOfSubset(a, n-1, tempSum + a[n], targetSum, sums);
        sums.add(a[n]);
    }
}
