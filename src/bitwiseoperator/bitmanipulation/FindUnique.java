package bitwiseoperator.bitmanipulation;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindUnique {
    public static void main(String[] args) {
        //int[] a = {1, 2, 3, 2, 1, 4};
        int[] a = {18, 24, 24, 21, 10, 29, 8, 10, 29, 18};
        int[] res = singleNumber(a);
        for(int x : res){
            System.out.println(x);
        }
    }

    public static int[] singleNumber(int[] nums)
    {
        int[] ans = new int[2];
        Map<Integer, Integer> count = new LinkedHashMap<>();
        for(int x : nums){
            if(count.containsKey(x)){
                count.put(x, count.get(x)+1);
            }else{
                count.put(x, 1);
            }
        }
        int i = 0;
        System.out.println(count);
        for(Map.Entry<Integer, Integer> m : count.entrySet()){
            if(m.getValue() == 1){
                ans[i] = m.getKey();
                i++;
            }
        }
        
        return ans;
    }
}
