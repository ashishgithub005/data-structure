package bitwiseoperator.bitmanipulation;

public class CountNumberOfConsistentString {
    public static void main(String[] args) {
        // String[] words = {"ad","bd","aaab","baa","badab"};
        // String allowd = "ab";

        // String[] words = {"a","b","c","ab","ac","bc","abc"};
        // String allowd = "abc";

        String[] words = {"cc","acd","b","ba","bac","bad","ac","d"};
        String allowd = "cad";

        
        int count = countConsistentString(words, allowd);
        System.out.println(count);
    }

    private static int countConsistentString(String[] words, String allowd) {
        int count = 0;
        int allowedMask = getMask(allowd);
        System.out.println("allowed mask : "+allowedMask);
        for(int i=0;i<words.length;i++){
            int wordMask = getMask(words[i]);
            System.out.println("wordMask : "+wordMask);
            if((allowedMask ^ wordMask) == 0){
                count++;
            }
        }
        return count;
    } 

    private static int getMask(String word){
        int mask = 0;
        for(int i=0;i<word.length();i++){
            mask = mask ^ (word.charAt(i) - 'a');
        }

        return mask;
    }
}
