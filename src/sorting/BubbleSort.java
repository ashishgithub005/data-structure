package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {8,5,4,7,31,60};
        System.out.println("*************: Before Sorting :**************");
        for(int i : a){
            System.out.print(i +", ");
        }
        for(int i=0;i<a.length-1;i++){
            boolean isSorted = true;
            for(int j =0;j<a.length-1-i;j++){
                if(a[j] > a[j+1]){
                    swap(a, j);
                    isSorted = false;
                }
            }
            if(isSorted){
                break;
            }
        }
        System.out.println();
        System.out.println("*************: After Sorting :**************");
        for(int i : a){
            System.out.print(i+", ");
        }
    }

    private static void swap(int[] a, int j) {
        int temp = a[j];
        a[j] = a[j +1];
        a[j +1] = temp;
    }
}
