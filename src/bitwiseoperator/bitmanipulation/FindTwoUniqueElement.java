package bitwiseoperator.bitmanipulation;

public class FindTwoUniqueElement {
    public static void main(String[] args) {
        int[] a = {1,2,3,1,5,2,4,4};
        //int[] a = {4,1,2,3,2,1,5,4};
        findTwoUniqueNumber(a);
    }

    private static void findTwoUniqueNumber(int[] a) {
        int xor = 0;
        int pos = 0;
        for (int j : a) {
            xor ^= j;
        }

        //iterate size of int() 32bit of xor to find set bit position
        for(int i=0;i< 32;i++){
           if((xor & (1<<i)) > 0){
               pos = i;
               break;
           }
        }

        int unSetBitSUm = 0;
        int setBitSUm = 0;
        //find xor of digit which have set bit equals to 1 and 0;
        for (int j : a) {
            //xor of digit which have set bit equals to 1
            if ((j & (1 << pos)) > 0) {
                setBitSUm ^= j;

                //xor of digit which have set bit equals to 0
            }else{
                unSetBitSUm ^= j;
            }
        }

        System.out.println(setBitSUm +" : "+unSetBitSUm);
    }
}
