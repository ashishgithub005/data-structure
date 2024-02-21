package array.twoD;

public class SearchTargetInMatrix {
    public static void main(String[] args) {
        //int[][] a ={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int[][] a = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 13;
        boolean result = isElementFound(a, target);
        System.out.print(result);
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
}
