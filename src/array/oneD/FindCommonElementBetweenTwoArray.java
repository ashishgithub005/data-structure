package array.oneD;

import java.util.*;
import java.util.stream.Collectors;

public class FindCommonElementBetweenTwoArray {
    public static void main(String[] args) {
        Integer[] a1 = { 1,2,3,4,5,6,7,8 };
        Integer[] a2 = { 8,7,6};
        List<Integer> res1 = findCommonElementUsingRetainAll(a1, a2);
        System.out.println(res1);
        Set<Integer> res2 = findCommonElementUsingJava8Stream(a1, a2);
        System.out.println(res2);

        Set<Integer> res3 = findCommonElementUsingMap(a1, a2);
        System.out.println(res3);
    }

    //TC = O(n) where n is the size of two array
    //SC = O(m + n) where m and n is the size of two list
    private static List<Integer> findCommonElementUsingRetainAll(Integer[] a1, Integer[] a2) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(a1));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(a2));
        l1.retainAll(l2);

        return l1;
    }

    //TC = O(n)
    //SC = O(m+n)
    private static Set<Integer> findCommonElementUsingJava8Stream(Integer[] a1, Integer[] a2) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(a1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(a2));

        return  set1.stream()
                .filter(set2::contains)
                .collect(Collectors.toSet());
    }

    //same as set
    private static Set<Integer> findCommonElementUsingMap(Integer[] a1, Integer[] a2) {
        Map<Integer, Integer> count = new HashMap<>();
        Set<Integer> commonElement = new HashSet<>();
        for(Integer i : a1){
            if(count.containsKey(i)){
                count.put(i, count.get(i)+1);
            }else{
                count.put(i, 1);
            }
        }
        //check duplicate
        for(Integer i : a2){
            if(count.containsKey(i)){
                commonElement.add(i);
            }
        }

        return  commonElement;
    }

}
