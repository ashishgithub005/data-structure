package recursion.ll;

import java.util.ArrayList;
import java.util.List;

public class CountNodeInLL {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

        int count = 0;
        countNode(count, l);
        System.out.println(count);
    }

    private static void countNode(int count, List<Integer> l) {
        if(l == null) return;


    }
}
