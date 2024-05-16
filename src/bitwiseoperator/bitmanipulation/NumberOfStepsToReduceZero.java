package bitwiseoperator.bitmanipulation;

public class NumberOfStepsToReduceZero {
    public static void main(String[] args) {
        //int n = 14;
        int n = 123;
        int res = numberOfSteps(n);
        System.out.println(res);
    }

    public static int numberOfSteps(int n) {
        int count = 0;
        while(n != 0){
            //if RIGHT MOST Bit is 0 then means number in even else odd
            /*
             * 0 => 0000  ==> RMB is 0 so even
             * 1 => 0001  ==> RMB is set so odd
             * 2 => 0010  ==> even
             * 3 => 0011  ==> odd
             * 4 => 0100
             */
            if((n&1) == 0){
                n = n >> 1;
                count++;
            }else{
                n = n-1;
                count++;
            }
        }

        return count;
    }
}
