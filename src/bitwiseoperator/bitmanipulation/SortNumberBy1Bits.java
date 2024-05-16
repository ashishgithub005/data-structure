package bitwiseoperator.bitmanipulation;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortNumberBy1Bits {
    public static void main(String[] args) {
        int[] a = {1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
        int[] res = sortNumberByBits(a);
        for(int i : res){
            System.out.print(i+" ");
        }
    }

    private static int[] sortNumberByBits(int[] a) {
        int n = a.length;
        Map<Integer, Integer> countSetBit = new LinkedHashMap<>();
        for (int i=0;i<n;i++) {
            countSetBit.put(a[i] ,countBit(i));
        }

        return sort(a, countSetBit, n);
    }

    private static int countBit(int num) {
        int count = 0;
        while (num > 0) {
            num = num & (num - 1);
            count++;
        }
        return count;
    }

    static int[] sort(int[] arr, Map<Integer, Integer> countSetBit, int n)  {
        List<Map.Entry<Integer, Integer>> list = countSetBit.entrySet().stream().sorted(Map.Entry.comparingByValue()).toList();
        int size = 0;
        for(Map.Entry<Integer, Integer> m1 : list){
            if(m1.getValue() == 1){
                size++;
            }
        }
        if(size == list.size()){
            list = list.stream().sorted(Map.Entry.comparingByKey()).toList();
        }
        int i = 0;
        for(Map.Entry<Integer, Integer> m1 : list){
            arr[i] = m1.getKey();
        }

        return arr;
    }

}
