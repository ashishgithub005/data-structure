package recursion.string;

public class ReverseString {
    public static void main(String[] args) {
        String st = "ashish kumar";
        System.out.println(st.length());
        String res = reverseStr(st,st.length()-1);
        System.out.println(res+" : "+res.length());
    }

    private static String reverseStr(String st, int endIndex) {
        if(endIndex == -1) return "";

        return  st.charAt(endIndex) + reverseStr(st, endIndex-1);
    }
}
