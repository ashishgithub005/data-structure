package sorting;

//Step 1 − Check if the first element in the input array is greater than the next element in the array.
//
//Step 2 − If it is greater, swap the two elements; otherwise move the pointer forward in the array.
//
//Step 3 − Repeat Step 2 until we reach the end of the array.
//
//Step 4 − Check if the elements are sorted; if not, repeat the same process (Step 1 to Step 3) from the last element of the array to the first.
//
//Step 5 − The final output achieved is the sorted array.

//TC : Best case : if array element is sorted in ascending order = O(n)
//TC : average case : if array element is in random order = O(n^2)
//TC : Best case : if array element is sorted in descending order = O(n^2)

//Space Complexity : O(1) because we are not using any extra space except loop variable

//stable in nature
//adaptive(if we change the order of element then time complexity also change)
//in place

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
