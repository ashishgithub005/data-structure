package recursion.string;

public class SubStringProblem {
    public static void main(String[] args) {
        String s = "ashish";
        int n = s.length();
        int res = findNoOfSubString(n);
        System.out.println(res);
    }

    private static int findNoOfSubString(int n) {
        if(n == 0) return 1;

        return 2 * findNoOfSubString(n-1);
    }
}
