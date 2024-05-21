package array.oneD.two.pointer;

public class TwoDifferenceProblem {
    public static void main(String[] args) {
        int[] a = {5,11,2,3,50,80};
        int target = 45;
        findTwoElementDifferenceUpToTarget(a, a.length, target);
    }

    private static void findTwoElementDifferenceUpToTarget(int[] a, int length, int target) {
        int first = 0;
        int second = 1;
        while(second != length-1){
            if(a[second] - a[first] == target){
                System.out.print(a[second]+", "+a[first]);
                break;
            }else if(a[second] - a[first] < target){
                second++;
            }else{
                first++;
            }
        }
    }
}
