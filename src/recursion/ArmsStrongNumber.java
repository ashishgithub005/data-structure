package recursion;

//ArmsStrongNumber is the number that is equal to sum of cube of its digit
//Ex: 153 => 1^3 + 5^3+ 3^3 = 153
public class ArmsStrongNumber {
    public static void main(String[] args) {
        int n = 153;

        int res = checkAnagram(n);
        if(n == res){
            System.out.println("ArmsStrongNumber");
        }else{
            System.out.println("Not a ArmsStrongNumber");
        }
    }

    private static int checkAnagram(int n) {
        if (n < 10) return n;
        int fact = n % 10;

        return fact * fact * fact + checkAnagram(n / 10);
    }
}
