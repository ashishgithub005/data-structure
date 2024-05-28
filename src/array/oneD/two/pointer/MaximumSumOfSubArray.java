package array.oneD.two.pointer;

public class MaximumSumOfSubArray {
    public static void main(String[] args) {
        //int[] a = {4,-6,2,8};
        int[] a = {-2,-3,4,-1,-2,1,5,-3};
        int res = maxSumSubArray(a, a.length);
        System.out.println(res);
        int maxSum = maxSumOfSubArrayUsingKadaneAlgo(a, a.length);
        System.out.println(maxSum);
    }
    //index of array element
    //{0}, {0,1}, {0,1,2}, {0,1,2,3}
    //prefixSum = 4, -2, 0, 8 max = 8
    //{1}, {1,2}, {1,2,3}
    //prefixSum = -6, -4, 4 max = 4
    //{2}, {2,3}
    //prefixSum = 2, 10 max = 10
    //{3}
    //prefixSum = 3 max = 3
    //so from all max = 10, so this is ans
    private static int maxSumSubArray(int[] a, int length) {
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<length;i++){
            int prefixSum = 0;
            for(int j=i;j<length;j++){
                prefixSum +=a[j];
                //System.out.print(prefixSum+" ");
                maxSum = Math.max(maxSum, prefixSum);

            }
            //System.out.println();
        }

        return maxSum;
    }

    //Kadane's algo
    //            4 -6 2 8
    //prefixSum = 4 -2 2 10
    //so here prefixSum is -2 so update -2 with 0
    //prefixSum become = 4 0 2 10
    //max from these prefix sums is 10 so this is the ans
    private static int maxSumOfSubArrayUsingKadaneAlgo(int[] a, int length){
        int maxSum = Integer.MIN_VALUE;
        int prefixSum = 0;
        for(int i=0;i<length;i++){
            prefixSum += a[i];
            maxSum = Math.max(maxSum, prefixSum);
            //if prefixSum is negative, then update prefixSum with zero.
            if(prefixSum < 0) prefixSum = 0;
        }

        return maxSum;
    }
}
