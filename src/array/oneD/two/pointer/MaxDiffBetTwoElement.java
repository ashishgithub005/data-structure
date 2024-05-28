package array.oneD.two.pointer;

public class MaxDiffBetTwoElement {
    public static void main(String[] args) {
        //element can find another element only after their current position
        int[] a = {9,5,8,12,2,3,7,4};
        int ans = findMaxDiffBruteForce(a, a.length);
        System.out.println(ans);
        int ans1 = findMaxDiffUsingSuffixMax(a, a.length);
        System.out.println(ans1);
    }
    // element  = 9,5,8,12,2,3,7,4
    //suffixMax = 12,12,12,12,7,7,7,4
    //element can check there next element from suffix array and subtract and find max from it.

    //TC = O(n)
    //SC = O(1)
    private static int findMaxDiffUsingSuffixMax(int[] a, int length) {
        int maxDiff = Integer.MIN_VALUE;
        int suffixMax = Integer.MIN_VALUE;
        for(int i=length-2;i >=0 ;i--){
           suffixMax = Math.max(suffixMax, a[i+1]);
           int diff = suffixMax - a[i];
           maxDiff = Math.max(maxDiff, diff);
        }

        return maxDiff;
    }

    //TC = O(n^2)
    //SC = O(1)
    private static int findMaxDiffBruteForce(int[] a, int length) {
        int maxDiff = Integer.MIN_VALUE;
        for(int i=0;i<length-1;i++){
            for(int j=i+1;j<length;j++){
                int diff = a[j] - a[i];
                maxDiff = Math.max(maxDiff, diff);
            }
        }

        return maxDiff;
    }
}
