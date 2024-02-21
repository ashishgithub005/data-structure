package sorting;
/*
*
* -------------------------------------------------------------------
* |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
* -------------------------------------------------------------------
* -> j from i-1 to 0th index <- | -> i from current position to n-1 ->
*
* */

//Step 1 − If it is the first element, it is already sorted. return 1;
//
//Step 2 − Pick next element
//
//Step 3 − Compare with all elements in the sorted sub-list
//
//Step 4 − Shift all the elements in the sorted sub-list that is greater than the value to be sorted
//
//Step 5 − Insert the value
//
//Step 6 − Repeat until list is sorted

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {8,5,4,7,60, 31};
        System.out.println("*************: Before Sorting :**************");
        for(int i : a){
            System.out.print(i +", ");
        }
        //oth index element is always sorted so i start from 1 and end from n-1 index(i moves from left to right)
        for(int i=1;i<a.length;i++){
            int key = a[i];
            //j start from i-1 position and move to 0th index(j moves from right to left)
            int j = i-1;
            //compare every sorted element with key(current element)
            //if key is smaller than sorted array element.
            while(j >=0 && key <= a[j]){
                //then shift greater element one position towards right.
                a[j+1] = a[j];
                //decrement j value
                j = j-1;
            }
            //insert key to its correct position
            a[j+1] = key;
        }

        System.out.println();
        System.out.println("*************: After Sorting :**************");
        for(int i : a){
            System.out.print(i+", ");
        }
    }
}
