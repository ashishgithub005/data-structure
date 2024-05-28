package array.twoD;

public class DiagonalTraversalMatrix {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printDiagonalMatrix(a, a.length, a[0].length);
    }

    private static void printDiagonalMatrix(int[][] a, int row, int col) {
        for(int i=0;i<row;i++)
        {
            System.out.print(a[i][i]+" ");
        }
        System.out.println();
        int j=col-1;
        for(int i=0;i<col;i++){
            System.out.print(a[i][j]+" ");
            j--;
        }
    }
}
