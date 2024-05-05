package bitwiseoperator.bitmanipulation;

import java.util.ArrayList;
import java.util.List;

public class NoOfSubSetOrPowerSet {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        List<List<Integer>> ans = findSubset(a);
        for(List<Integer> kk : ans){

                System.out.println(kk);

        }
    }

    private static List<List<Integer>> findSubset(int[] a) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = a.length;
        int noOfSubSet = (1<<n);
        //iterate over total number of subset
        for(int i=0;i<noOfSubSet;i++){
            List<Integer> currentSubset = new ArrayList<>();
            //iterate over array elements
            for(int j=0;j<n;j++){
                //check jth bit is set or not of i number.
                if((i & (1<<j)) >= 1){
                    currentSubset.add(a[j]);
                }
            }
            ans.add(currentSubset);
        }

        return ans;
    }
}
