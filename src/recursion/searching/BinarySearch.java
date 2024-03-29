package recursion.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,10,11, 15, 16};
        int key = 11;
        int index = binarySearch(a, key,0, a.length-1);
        if(index > 0){
            System.out.println("element found on index at : "+index);
        }else {
            System.out.println("element not found");
        }
    }

    private static int binarySearch(int[] a, int key,int startIndex ,int lastIndex) {
        if(startIndex > lastIndex) return -1;
        int mid = startIndex + (lastIndex - startIndex)/2;
        if(a[mid] == key)
            return mid;
        if(a[mid] < key)
            return binarySearch(a, key, mid+1, lastIndex);
        else
            return binarySearch(a, key, startIndex, mid-1);
    }
}
