package array.twoD;

public class DiagonalSumIn2D {
    public static void main(String[] args) {
        //int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] a = {{2,4,6}, {8,10,12}, {14,16,18}};
        int sum = diagonalSum(a, a.length, a[0].length);
        System.out.println(sum);
    }

    private static int diagonalSum(int[][] a, int row, int col) {
        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum += a[i][i];
        }
        int j = col - 1;
        for (int i = 0; i < row; i++) {
            sum += a[i][j];
            j--;
        }

        return sum;
    }
}

