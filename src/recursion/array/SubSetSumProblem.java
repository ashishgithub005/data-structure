package recursion.array;

import java.util.ArrayList;
import java.util.List;

public class SubSetSumProblem {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        List<Integer> sums = new ArrayList<>();
        int tempSum = 0;
        int n = a.length-1;
        subsetSum(a,n,sums, tempSum);
        System.out.println(sums);
        Integer res = sums.stream().reduce(0, Integer::sum);
        System.out.println("total sum : "+res);
    }

    private static void subsetSum(int[] a, int n, List<Integer> sums, int tempSum) {
        if(n == -1) {
            sums.add(tempSum);
            return;
        }
        //ignore
        subsetSum(a, n-1, sums, tempSum);
        //accept
        subsetSum(a,n-1, sums, tempSum + a[n]);
    }
}
