package bitwiseoperator.bitmanipulation;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] res = flipAndInvertImage(image);
        for (int[] k : res) {
            for (int i : k) {
               System.out.print(i+" ");
            }
            System.out.println();
        }

        int[][] res1 = flipAndInvertImageWithoutExtraSPace(image);
    }

    private static int[][] flipAndInvertImageWithoutExtraSPace(int[][] image) {


        return new int[3][];
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] temp = new int[n][n];
        for(int i =0;i<n;i++)
        {
            int k = n-1;
            for(int j=0;j<n;j++){
                temp[i][j] = image[i][k];
                k--;
            }
        }

        for(int i =0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                if((temp[i][j] & 1) == 1){
                    temp[i][j] = 0;
                }else{
                    temp[i][j] = 1;
                }
            }
        }

        return temp;
    }
    
}
