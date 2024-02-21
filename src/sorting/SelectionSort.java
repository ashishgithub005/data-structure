package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {8,5,4,7,60, 31};
        System.out.println("*************: Before Sorting :**************");
        for(int i : a){
            System.out.print(i +", ");
        }
        int n = a.length;
        for(int i=0;i< n;i++){
            //let assume current index(i) has the minimum element
            int min_index = i;
            //find minimum element from remaining unsorted array and update min_index.
            for(int j = i+1;j<n;j++){
                if(a[j] < a[min_index]){
                    min_index = j;
                }
            }
            //once we found minimum element index then swap min_index element with current element(ith position element)
            int temp = a[i];
            a[i] =  a[min_index];
            a[min_index] = temp;
        }

        System.out.println();
        System.out.println("*************: After Sorting :**************");
        for(int i : a){
            System.out.print(i+", ");
        }
    }
}
