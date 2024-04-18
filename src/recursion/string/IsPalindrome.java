package recursion.string;

public class IsPalindrome {
    public static void main(String[] args) {
        String s = "abaaba";
        boolean isPalindrome = isPalindrome(s, 0,s.length()-1);
        System.out.println(isPalindrome);
    }
    private static boolean isPalindrome(String s, int startIndex,int endIndex) {
        //if both indexes equal then that means only one character.
        //if both indexes are crossed to each other than that means empty string.
        //single character and empty string always treated as palindrome that means always return true.
        if(startIndex >= endIndex) return true;

        return s.charAt(startIndex) == s.charAt(endIndex) && isPalindrome(s, startIndex +1, endIndex -1);
    }
}
