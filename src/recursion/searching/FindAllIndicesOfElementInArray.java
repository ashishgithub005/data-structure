package recursion.searching;

import java.util.ArrayList;
import java.util.List;

public class FindAllIndicesOfElementInArray {
    public static void main(String[] args) {
        int[] a = {7,2,5,2,10,2,2};
        int key = 2;
        List<Integer> indices = findAllIndices(a, 0, key);
        System.out.println(indices);
    }

    private static List<Integer> findAllIndices(int[] a, int i, int key) {

        if(i == a.length) return new ArrayList<>();

        List<Integer> addIndices = new ArrayList<>();
        if(key == a[i]) addIndices.add(i);

        List<Integer> updatedIndices = findAllIndices(a, i+1, key);
        updatedIndices.addAll(addIndices);

        return updatedIndices;
    }
}
