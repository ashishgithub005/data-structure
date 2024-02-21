package array.twoD;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int result = calculateDiagonalSum(a);
        System.out.print(result);
    }

    private static int calculateDiagonalSum(int[][] a) {
        int sum = 0;
        int n = a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<a[i].length;j++){
                if(i == j) sum+=a[i][j];
            }
        }

        return sum;
    }


}
