package bitwiseoperator.bitmanipulation;

import java.util.Arrays;
import java.util.List;

public class SumOfIndicesWithKSetBits {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5,10,1,5,2);
        //List<Integer> nums = Arrays.asList(5,5,5);
        int k =1;
        int res = sumIndicesWithKSetBits(nums, k);
        System.out.println(res);
    }
    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for(int i=0;i<nums.size();i++){
            int count = findSetBitCount(i);
            if(count == k){
                sum +=nums.get(i);
            }
        }

        return sum;
    }

    public static int findSetBitCount(int index){
        int count = 0;
        for(int i=0;i<32;i++){
            if((index & (1 << i)) > 0){
                count++;
            }
        }

        return count;
    }

    static int countSetBits(int n)
    {
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }

    //TC = O(logn)
    static int countSetBitsBF(int n)
    {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    //TC = O(logn)
    public static int countSetBitsUsingRecursion(int n)
    {
        // base case
        if (n == 0)
            return 0;
        else
            return 1 + countSetBitsUsingRecursion(n & (n - 1));
    }
}
