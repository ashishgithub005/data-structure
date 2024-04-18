package recursion;

public class GCD {
    public static void main(String[] args) {
        int x = 18;
        int y = 48;

        int resDivisor = gcdUsingDivisorApproach(x, y);
        System.out.println(resDivisor);

        int res = gcdUsingEuclids(x, y);
        System.out.println(res);

        int resUsingI = gcdIterativeApproach(x, y);
        System.out.println(resUsingI);
    }
    /*  18 ) 48 ( 2
    *        36
    *      -----
    *        12) 18 ( 1
    *            12
    *           ------
    *             06) 12 ( 2
    *                 12
    *               ------
    *                 00
    *
    * so here 6 is gcd
    * Based on above Euclids conclude : GCD(x, y) = GCD(y, x % y) and GCD(x, 0) = x
    *
    * Ex : GCD(48, 18) => GCD(18, 48 % 18) => GCD(18, 12)
    *
    * */
    private static int gcdUsingDivisorApproach(int x, int y) {
        while(x % y != 0){
            int rem = x % y;
            x = y;
            y = rem;
        }

        return y;
    }
/*
* Euclids says :
*
*  GCD(x, y) = GCD(y, x % y) and GCD(x, 0) = x
*
*/
    private static int gcdUsingEuclids(int x, int y) {
        if (y == 0) return x;

        return gcdUsingEuclids(y, x % y);
    }

   /*
      18 => 1, 2, 3, 6, 18
      48 => 1, 2, 3, 4, 6, 8, 12, 16, 24, 48
      common divisor => 1, 2, 3, 6
      maximum common divisor => 6 so 6 is GCD or HCF
    */
    private static int gcdIterativeApproach(int x, int y) {
        for (int i = Math.min(x, y); i >= 0; i--) {
            if (x % i == 0 && y % i == 0) return i;
        }

        return 1;
    }
}
