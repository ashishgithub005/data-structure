package bitwiseoperator.bitmanipulation;

public class MaximumStrongPairXor {
    public static void main(String[] args) {
        int[] a = {1,1,10,3,9};
        int res = findMaxPair(a);
        System.out.println(res);
    }

    private static int findMaxPair(int[] nums) {
        int n = nums.length;
        int max = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(Math.abs(nums[i]-nums[j]) <= Math.min(nums[i], nums[j])){
                    int xor = nums[i] ^ nums[j];
                    if(xor > max){
                        max = xor;
                    }
                }
            }
        }

        return max;
    }
}
