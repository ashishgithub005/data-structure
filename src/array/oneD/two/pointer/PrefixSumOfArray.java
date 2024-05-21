package array.oneD.two.pointer;

public class PrefixSumOfArray {
    public static void main(String[] args) {
        int[] a = {10, 20, 10, 5, 15};
        int[] prefixSum = findPrefixSum(a, a.length);
        for(Integer i : prefixSum){
            System.out.print(i+" ");
        }
        System.out.println();
        int[] suffixSum = findSuffixSum(a, a.length);
        for(Integer i : suffixSum){
            System.out.print(i+" ");
        }
    }

    /*
     A prefix sum array is another array prefixSum[] of the same size,
     such that the value of prefixSum[i] is arr[0] + arr[1] + arr[2] . . . arr[i].

     Ex:

     Input: arr[] = {10, 20, 10, 5, 15}
        Output: prefixSum[] = {10, 30, 40, 45, 60}
        Explanation: While traversing the array, update the element by adding it with its previous element.
        prefixSum[0] = 10,
        prefixSum[1] = prefixSum[0] + arr[1] = 30,
        prefixSum[2] = prefixSum[1] + arr[2] = 40 and so on.
    */
    private static int[] findPrefixSum(int[] a, int length) {
        int[] prefixSum = new int[length];
        prefixSum[0] = a[0];
        for(int i=1;i<length;i++){
            prefixSum[i] = a[i] + prefixSum[i-1];
        }

        return prefixSum;
    }

//    Input: arr[] = { 15, 10, 25, 5, 10, 20 } , N = 6
//    Output: suffixSum[] = { 85, 70, 60, 35, 30, 20}
//    Explanation: While traversing the array from back,
//    keep adding element from the back with element at current index.
//    suffixSum[5] = 20,
//    suffixSum[4] =suffixSum[5] + arr[4] = 20+10 = 30 ,
//    suffixSum[3] = suffixSum[4] + arr[3] = 30+5 = 35 and so on.
    private static int[] findSuffixSum(int[] a, int length) {
        int[] suffixSum = new int[length];
        suffixSum[length-1] = a[length-1];
        for(int i=length-2;i>=0;i--){
            // Adding a present element with a previous element of prefixSum array
            suffixSum[i] = a[i] + suffixSum[i+1];
        }

        return suffixSum;
    }
}
