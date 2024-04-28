package bitwiseoperator;

public class BitwiseOperator {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 7;

        System.out.println(n1 | n2); //OR operation
        System.out.println(n1 & n2); // AND operation
        System.out.println(n1 ^ n2); // XOR operation
        System.out.println(n1 << 2); // left shit by 2
        System.out.println(n2 >> 2); // right shift by 2
        System.out.println(~n2); // ~ refer 1st complement

    }
}
