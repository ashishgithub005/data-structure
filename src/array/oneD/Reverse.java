package array.oneD;

public class Reverse {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        reverse(a);
        for(Integer i : a){
            System.out.print(i+" ");
        }

    }

    private static void reverse(int[] a) {
        int i=0;
        int j = a.length-1;
        while(i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
}
