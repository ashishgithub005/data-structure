package bitwiseoperator.bitmanipulation;

public class DecodeXORedArray {
    public static void main(String[] args) {
        //int[] encoded = {1,2,3};
        //int first= 1;
        int[] encoded = {6,2,7,3};
        int first= 4;

        int[] res = decode(encoded, first);
        for(int i : res){
            System.out.print(i+" ");
        }
    }

    public static int[] decode(int[] encoded, int first) {
        int[] original = new int[encoded.length+1];
        original[0] = first;
        //using xor properties
        /*
        *  en[i] = a[i] ^ a[i+1]
        * so here we can xor both side a[i]
        * en[i] ^ a[i] = a[i] ^ a[i] ^ a[i+1]
        * en[i] ^ a[i] = a[i+1] so here a[i] ^ a[i] become zero
        * so we can write : a[i+1] = en[i] ^ a[i]
        *
        */
        for(int i=0;i<encoded.length;i++){
            original[i+1] = encoded[i] ^ original[i];
        }

        return original;
    }
}
