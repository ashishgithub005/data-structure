package recursion.simple.problem;

public class RemoveOdd {
    public static void main(String[] args) {
        int[] a = {1, 54, 88, 6, 55, 7};
        remove(a, a.length-1);
        for(int a1 : a){
            if(a1 !=0){
                System.out.println(a1);
            }
        }
    }

    private static void remove(int[] a, int n) {
        if(n == -1) return;
        if(a[n] % 2 == 1) a[n] = 0;

        remove(a, n-1);
    }
}
