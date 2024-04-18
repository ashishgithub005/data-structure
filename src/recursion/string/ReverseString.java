package recursion.string;

public class ReverseString {
    public static void main(String[] args) {
        String st = "ashish";
        //System.out.println(st.length());
        String res = reverseStr(st,0);
        System.out.println(res);
    }

    /*
    *  st = "abcd" => "bcd" + "a"
    *  reverseStr(st, startIndex +1) + st.charAt(startIndex) when i < n
    *  "" when i == n { base case}
    */
    private static String reverseStr(String st, int startIndex) {
        if(startIndex == st.length()) return "";

        return  reverseStr(st, startIndex +1) + st.charAt(startIndex);
    }
}
