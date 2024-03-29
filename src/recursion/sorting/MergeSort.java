package recursion.sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] a= {10, 9, 8, 7, 6, 5, 4, 3, 2, 1} ;
        mergeSort(a,0,a.length-1);
        for (int j : a) {
            System.out.print(j + " ");
        }
    }

    private static void mergeSort(int[] a, int startIndex, int endIndex) {
        if(startIndex >= endIndex) return;
        int mid = startIndex + (endIndex - startIndex)/2;
        mergeSort(a, startIndex, mid);
        mergeSort(a, mid+1, endIndex);
        merge(a, startIndex, mid, endIndex);
    }

    private static void merge(int[] a, int startIndex, int mid, int endIndex) {
        int[] temp = new int[endIndex-startIndex+1];
        int left = startIndex;
        int right = mid+1;
        int tempIndex = 0;
        while (left <= mid && right <=endIndex){
            if(a[left] <= a[right]){
                temp[tempIndex] = a[left];
                tempIndex++;
                left++;
            }else {
                temp[tempIndex] = a[right];
                tempIndex++;
                right++;
            }
        }
        //fill remaining left array data
        while(left <= mid){
            temp[tempIndex] = a[left];
            tempIndex++;
            left++;
        }
        //fill remaining right array data
        while(right <= endIndex){
            temp[tempIndex] = a[right];
            tempIndex++;
            right++;
        }
        //copy temp array element into original array
       System.arraycopy(temp, 0, a, startIndex, temp.length);
    }
}
