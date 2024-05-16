package bitwiseoperator.bitmanipulation;

public class CountingBit {
    public static void main(String[] args) {
        int n = 5;
        int[] countSetBit = countSetBit(n);
        for(int i : countSetBit){
            System.out.println(i);
        }
    }

    private static int[] countSetBit(int n) {
        int[] ans = new int[n+1];
        for(int i=0;i<=n;i++){
            int count = 0;
            int temp = i;
            while(temp > 0){
                int rmsb = (i & -i);
                temp = temp - rmsb;
                count++;
            }
            ans[i] = count;
        }

        return ans;
    }
}
