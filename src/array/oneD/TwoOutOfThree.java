package array.oneD;

import java.util.HashSet;
import java.util.Set;

public class TwoOutOfThree {
    public static void main(String[] args) {
//        int[] one = {1, 1, 3, 2};
//        int[] two = {2, 3};
//        int[] three = {3};
        int[] one = {1,2,2};
        int[] two = {4,3,3};
        int[] three = {5};

        Set<Integer> ans = findOutOfThree(one, two, three);
        System.out.println(ans);
    }

    private static Set<Integer> findOutOfThree(int[] one, int[] two, int[] three) {
        Set<Integer> duplicate = new HashSet<>();
        Set<Integer> ans = new HashSet<>();

        return ans;
    }

}
