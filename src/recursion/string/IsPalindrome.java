package recursion.string;

public class IsPalindrome {
    public static void main(String[] args) {
        String s = "abaaba";
        boolean isPalindrome = isPalindrome(s, 0,s.length()-1);
        System.out.println(isPalindrome);
    }

    private static boolean isPalindrome(String s, int startIndex,int endIndex) {
        //if both index is crossed or at same position,
        // then that means both position character is same,
        // so return always return true
        if(startIndex >= endIndex) return true;

        //both position character is not same then return false.
        if(s.charAt(startIndex) != s.charAt(endIndex))
            return false;

        //else move to next character.
        return isPalindrome(s, startIndex +1, endIndex -1);
    }

}
