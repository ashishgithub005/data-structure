package sorting;

public class QuickSort {
    public static void main(String[] args) {
       // int[] a = {8,5,4,7,31,60};
       // int[] a = {7,6,5,4,3,2,1};
        //int[] a = {1, 2, 3, 4, 5, 6, 7};
        int[] a = { 10, 7, 8, 9, 1, 5 };

        int low = 0;
        int high = a.length-1;
        System.out.println("*************: Before Sorting :**************");
        for(int i : a){
            System.out.print(i +", ");
        }
        quickSort(a, low, high);
        System.out.println();
        System.out.println("*************: After Sorting :**************");
        for(int i : a){
            System.out.print(i+", ");
        }
     }

     private static void quickSort(int[] a, int low, int high){
         if(low < high) {
             int pivotIndex = partition(a, low, high);
             quickSort(a, low, pivotIndex-1);
             quickSort(a, pivotIndex + 1, high);
         }
     }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller than the pivot
            if (arr[j] < pivot) {

                // Increment index of smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
