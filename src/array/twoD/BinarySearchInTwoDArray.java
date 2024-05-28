package array.twoD;

public class BinarySearchInTwoDArray {
    public static void main(String[] args) {
        int[][] a = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 11;
        boolean res = binarySearchInTwoDArray(a, a.length, a[0].length, target);
        System.out.println(res);
    }

    private static boolean binarySearchInTwoDArray(int[][] a, int row, int col, int target) {
        int start = 0;
        //end of rowOrder 1d array matrix
        int end = row * col -1;

        while(start < end){
            int mid = start + (end - start)/2;
            //from rowIndex 1d array matrix we find row index
            int rowIndex = mid / col;
            //from rowIndex 1d array matrix we find col index
            int colIndex = mid % col;

            if(a[rowIndex][colIndex] == target){
                return true;
            } else if (a[rowIndex][colIndex] < target) {
                start = mid + 1;
            }else {
                end = mid -1;
            }
        }

        return false;
    }
}
