package recursion.array;

public class MinimumPossibleCostToREachStone {
    public static void main(String[] args) {
        int[] a = {10,30,40,20};
        int res = minPossibleCost(a, 0);
        System.out.println(res);
    }

    private static int minPossibleCost(int[] a, int i) {
        //if we reached stone then array size become length of array
        if(i == a.length-1) return 0;

        int totalCostWithIlpus1 = Math.abs(a[i] - a[i+1]) + minPossibleCost(a, i+1);
        //if we reached on stone (n-2) position then only possible way to reach n stone is i+1 way
        // not i+2 way so directly return totalCostWithIlpus1 cost.
        if(i == a.length-2) return totalCostWithIlpus1;
        int totalCostWithIlpus2 = Math.abs(a[i] - a[i+2]) + minPossibleCost(a, i+2);

        return Math.min(totalCostWithIlpus1, totalCostWithIlpus2);
    }
}
