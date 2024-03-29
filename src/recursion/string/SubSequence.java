package recursion.string;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {
    public static void main(String[] args) {
        String s = "abc";
        String temp = "";
        List<String> ans = new ArrayList<>();
        usingRecursion(s, 0, s.length(), temp, ans);
        System.out.println(ans);
    }

    private static void usingRecursion(String s, int i, int n, String temp, List<String> ans) {
        if(i == n) {
            ans.add(temp);
            return;
        }
        //skip character
        usingRecursion(s, i+1, n, temp, ans);
        //consider character
        temp = temp + s.charAt(i);
        usingRecursion(s, i+1, n, temp, ans);
    }
}
