package array.twoD;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Before Transpose");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int[][] trans = transPoseOfMatrix(a, a.length, a[0].length);
        System.out.println("After Transpose");
        for(int i=0;i<trans.length;i++){
            for(int j=0;j<trans[i].length;j++){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }

        int[][] trans1 = transPoseOfMatrixInPlace(a, a.length, a[0].length);
        System.out.println("After Transpose");
        for(int i=0;i<trans1.length;i++){
            for(int j=0;j<trans1[i].length;j++){
                System.out.print(trans1[i][j]+" ");
            }
            System.out.println();
        }

    }

    private static int[][] transPoseOfMatrix(int[][] a, int row, int col) {
        int[][] temp = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                temp[j][i] = a[i][j];
            }
        }

        return temp;
    }

    //excepti diagonal element swap uper trigonal with lower trigonal matrix and vice versa

    //usecase : find k rotation of matrix
    private static int[][] transPoseOfMatrixInPlace(int[][] a, int row, int col) {
        for(int i=0;i<row;i++){
            for(int j=i+1;j<col;j++){
                //swap a[i][j] with a[j][i] and vice-versa
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        return a;
    }
}
