package recursion.array;

public class BubbleSortUsingRecursion {
    public static void main(String[] args) {
        int[] a = {5,1,4,7,6,2,9, 3};
        bubbleSort(a, a.length-1);
//        for(int i : a){
//            System.out.print(i + " ");
//        }
    }

    private static void bubbleSort(int[] a, int n) {
        if(n == -1) return;
        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println();
        //find highest element.
        int count = 0;
        for(int j = 0; j< n;j++){
           if(a[j] > a[j+1]){
               int temp = a[j];
               a[j] = a[j+1];
               a[j+1] = temp;
               count++;
           }
        }
        if(count == 0) return;

        //no of passes.
        bubbleSort(a, n-1);
    }
}
