package array.twoD;

public class SearchTargetInMatrix {
    public static void main(String[] args) {
        //int[][] a ={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int[][] a = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 112;
//        boolean result = isElementFound(a, target);
//        System.out.println(result);
//        boolean usingBS = isElementFoundBinarySearch(a, target);
//        System.out.println(usingBS);

        usingRowMajor(a, a.length, a[0].length, target);
    }

    private static boolean isElementFound(int[][] a, int target) {
        boolean isFound = false;
        for(int[] i : a){
            for(int j : i){
                if (j == target) {
                    isFound = true;
                    break;
                }
            }
        }
        return isFound;
    }

    //iterate every row and then apply binary search on the whole row.
    //TC = O(nlogm) where n is size of row and m is the size of col
    private static boolean isElementFoundBinarySearch(int[][] a, int target) {
        boolean isFound = false;
        //iterate every row
        for(int i=0;i<a.length;i++){
             //apply binary Search
            isFound = binarySearch(a[i], target);
            if(isFound) break;
        }

        return isFound;
    }

    private static boolean binarySearch(int[] a, int target) {
        int start = 0;
        int end = a.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(a[mid] == target){
                return true;
            } else if (a[mid] < target) {
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        
        return false;
    }

    //convert array into row major matrix then apply binary search
    private static void usingRowMajor(int [][] a, int row, int col, int target){
        int[] temp = new int[row * col];
        int k = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++) {
                temp[k++] = a[i][j];
            }
        }

        boolean isFound = binarySearch(temp, target);
        System.out.println(isFound);
    }
}
