package array.oneD.two.pointer;

public class KThElementMaxSum {
    public static void main(String[] args) {
        int[] a = {-1,2,3,3,4,5,-1};
        int k = 4;
        int l = 0;
        int r = k;
        int max = Integer.MIN_VALUE;
        while(r < a.length){
            int sum = 0;
            for(int i=l;i<r;i++){
               sum +=a[i];
            }
            max = Math.max(max, sum);
            l++;
            r++;
        }

        System.out.println(max);
    }
}
