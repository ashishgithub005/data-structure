package bitwiseoperator.bitmanipulation;

public class ConvertIntoBinary {
    public static void main(String[] args) {
        int n = 13;
        convertIntoBin(n);
    }

    private static void convertIntoBin(int n) {
        if(n > 1) convertIntoBin(n >> 1);

        System.out.print(n & 1);
    }
    
}
