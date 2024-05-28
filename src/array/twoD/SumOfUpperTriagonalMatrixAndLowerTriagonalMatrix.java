package array.twoD;

public class SumOfUpperTriagonalMatrixAndLowerTriagonalMatrix {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int upperTriagonalMatrixSum = sumUpperTriagonalMatrix(a, a.length, a[0].length);
        System.out.println("upperTriagonalMatrixSum : "+upperTriagonalMatrixSum);
        int lowerTriagonalMatrixSum = sumLowerTriagonalMatrix(a, a.length, a[0].length);
        System.out.println("lowerTriagonalMatrixSum : "+lowerTriagonalMatrixSum);
    }

    private static int sumUpperTriagonalMatrix(int[][] a, int row, int col) {
         int sum = 0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(i <= j){
                    sum +=a[i][j];
                }
            }
        }

        return sum;
    }

    private static int sumLowerTriagonalMatrix(int[][] a, int row, int col) {
        int sum = 0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(i >= j){
                    sum +=a[i][j];
                }
            }
        }

        return sum;
    }
}
