package array.oneD.two.pointer;

import java.util.Arrays;

//Two pointer we can apply there were array is in sorted order
//also if we increase one end and decrease another end, then it will give different output. Then only we can apply two pointer approach
public class TwoSumProblem {
    public static void main(String[] args) {
        int[] a = {1, 3, 6, 8, 10, 15, 20};
        int target = 21;
        findTwoSumPair(a, target);
        usingBinarySearch(a, target);
    }

    //TC = O(n)
    //SC = O(1)
    private static void findTwoSumPair(int[] a, int target) {
        int n = a.length;
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int sum = a[start] + a[end];
            if (sum == target) {
                System.out.println(a[start] + ", " + a[end]);
                break;
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
    }

    //TC = O(nlogn)
    //SC = O(1)
    private static void usingBinarySearch(int[] a, int target) {
        //iterate each element of array and subtract from a target element.
        //then using binary search that number.
        for (Integer i : a) {
            int secondNumber = target - i;
            //int found = binarySearch(a, secondNumber);
            int found = binarySearchUsingRecursion(a, 0, a.length - 1, secondNumber);
            if (found > -1) {
                System.out.print(i + " " + a[found]);
                break;
            }
        }

    }

    private static int binarySearch(int[] a, int secondNumber) {
        int n = a.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (a[mid] == secondNumber) {
                return mid;
            } else if (a[mid] < secondNumber) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    private static int binarySearchUsingRecursion(int[] a, int start, int end, int target) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (a[mid] == target) {
                return mid;
            } else {
                if (a[mid] < target) {
                    return binarySearchUsingRecursion(a, mid + 1, end, target);
                } else {
                    return binarySearchUsingRecursion(a, start, mid - 1, target);
                }
            }
        }

        return -1;
    }
}
