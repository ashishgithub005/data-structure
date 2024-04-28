package recursion.string;

import java.util.ArrayList;
import java.util.Collections;

/*
*           abc, temp=""
*
*
*/
public class SubSequence {
    public static void main(String[] args) {
        String s = "abcd";
        usingRecursion(s, 0, "");
        System.out.println("\n");
        usingSubStringRecursion(s, "");
        System.out.println("\n");
        ArrayList<String> res = AllPossibleStrings(s);
        System.out.println(res);
    }

    private static void usingRecursion(String s, int i, String temp) {
        if(i == s.length()) {
            System.out.print(temp+" ");
            return;
        }
        //extract currentChar
        char currentChar = s.charAt(i);
        usingRecursion(s, i+1, temp); //exclude current char
        usingRecursion(s, i+1, temp + currentChar); //include current char
    }

    private static void usingSubStringRecursion(String s, String temp) {
        if(s.isEmpty()) {
            System.out.print(temp+" ");
            return;
        }
        //extract currentChar
        char currentChar = s.charAt(0); //here we always extract 0th index char
        usingSubStringRecursion(s.substring(1), temp); //exclude current char
        usingSubStringRecursion(s.substring(1), temp + currentChar); //include current char
    }

    static ArrayList<String> AllPossibleStrings(String s) {
        int n = s.length();
        ArrayList<String>ans=new ArrayList<>();
        for (int num = 0; num < (1 << n); num++) {
            StringBuilder sub = new StringBuilder();
            for (int i = 0; i < n; i++) {
                //check if the ith bit is set or not
                if ((num & (1 << i))!=0) {
                    sub.append(s.charAt(i));
                }
            }
            if (!sub.isEmpty()) {
                ans.add(sub.toString());
            }
        }
        Collections.sort(ans);
        return ans;
    }



}
