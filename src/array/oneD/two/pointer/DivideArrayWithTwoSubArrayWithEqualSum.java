package array.oneD.two.pointer;

public class DivideArrayWithTwoSubArrayWithEqualSum {
    public static void main(String[] args) {
        int[] a = {3,4,-2,5,8,20,-10,8};
        boolean found1 = findTwoSubArray(a, a.length);
        System.out.println(found1);
        boolean found2 = findTwoSubArrayUsingPrefixSum(a, a.length);
        System.out.println(found2);
    }

    //TC = O(n^2)
    //SC = O(1)
    private static boolean findTwoSubArray(int[] a, int length) {
        int sum = 0;
        for(int i=0;i<length;i++){
            sum = sum + a[i];
            int secondSum = findSubArraySum(a, i, length);
            if(sum == secondSum){

                return true;
            }
        }

        return false;
    }

    private static int findSubArraySum(int[] a, int index, int length) {
        int sum = 0;
        for(int i= index +1;i<length;i++ ){
            sum +=a[i];
        }

        return sum;
    }

    //TC =O(n)
    //SC = O(1)
    private static boolean findTwoSubArrayUsingPrefixSum(int[] a, int length) {
        int sum = 0;
        int totalSum = 0;
        for(Integer i : a){
            totalSum +=i;
        }
        int firstSubArraySum = 0;
        for(int i=0;i<length;i++){
            firstSubArraySum +=a[i];
            int secondSubArraySum = totalSum - firstSubArraySum;
            if(firstSubArraySum == secondSubArraySum){

                return true;
            }
        }

        return false;
    }
}
