package string;

public class CountNoOfConsistentString {
    public static void main(String[] args) {
        // String[] a = {"a","b","c","ab","ac","bc","abc"};
        // String allowed = "abc";
        // String[] words = {"ad","bd","aaab","baa", "aab","badab"};
        // String allowed = "ab";

        String[] words = {"cc","acd","b","ba","bac","bad","ac","d"};
        String allowd = "cad";

        int count = noOfConsistentString(words, allowd);
        System.out.println(count);
    }

    private static int noOfConsistentString(String[] words, String allowed) {
        int count = 0;
        int allowedMask = getMask(allowed);
        for(String s : words){
            int wordMask = getMask(s);
            if((allowedMask & wordMask) == allowedMask){
                count++;
            }
        }

        return count;
    }

    private static int getMask(String str){
        int mask = 0;
        for(int i=0;i<str.length();i++){
            mask = 1 << (str.charAt(i) - 'a');
        }
        
       return mask;
    }
}
