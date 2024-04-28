package recursion.string;

public class DecodeString {
    public static void main(String[] args) {
       String s = s = "3[a]2[bc]";
       String res = decodeString(s);
       System.out.println(res);
    }
    public static String decodeString(String s) {
        return printDecodingCHar(s, 0);
    }

    public static String printDecodingCHar(String s, int i){
        if(i == s.length()) return "";
        if(s.charAt(i) <10){
            String res = expandChar(Integer.parseInt(String.valueOf(s.charAt(i))), s.substring(i+1), "");
            System.out.println(res);
        }


        return printDecodingCHar(s, i+1);
    }
    public static String expandChar(int k,String ch, String res){
        if(k == 0) return "";

        return res + ch + expandChar(k-1, ch, res);
    }
}
