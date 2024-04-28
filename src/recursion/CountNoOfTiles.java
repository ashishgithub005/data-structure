package recursion;

public class CountNoOfTiles {
    public static void main(String[] args) {
        int n = 5;
        int res = countNoOfTiles(n);
        System.out.println(res);
    }

    private static int countNoOfTiles(int n) {
        if(n <= 2) return n;

        return countNoOfTiles(n-1) + countNoOfTiles(n-2);
    }
}
