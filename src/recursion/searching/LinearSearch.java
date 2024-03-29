package recursion.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {7,2,5,8,10,1,6};
        int key = 11;
        int index = linearSearch(a, key, a.length-1);
        if(index > 0){
            System.out.println("element found on index at : "+index);
        }else {
            System.out.println("element not found");
        }

    }

    private static int linearSearch(int[] a, int key, int lastIndex) {
        if(lastIndex == -1) return -1;
        if(a[lastIndex] == key) return lastIndex;

        return linearSearch(a, key, lastIndex-1);
    }
}
