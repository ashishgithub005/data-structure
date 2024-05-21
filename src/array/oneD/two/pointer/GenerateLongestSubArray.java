package array.oneD.two.pointer;

public class GenerateLongestSubArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        generateAllSubArray(a);
    }

    private static void generateAllSubArray(int[] a) {
        int n = a.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }
    }
}
