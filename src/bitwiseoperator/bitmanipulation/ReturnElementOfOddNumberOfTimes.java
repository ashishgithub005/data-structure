package bitwiseoperator.bitmanipulation;

/*
*
* */
public class ReturnElementOfOddNumberOfTimes {
    public static void main(String[] args) {
        int[] a = {2,1,3,2,1,1,1,4,4};
        findOddNumberOfElement(a);
    }

    private static void findOddNumberOfElement(int[] a) {
        // x ^ 0 = x
        int xor = 0;
        for (int j : a) {
            xor ^= j;
        }

        System.out.println("the odd number is : "+xor);
    }
}
