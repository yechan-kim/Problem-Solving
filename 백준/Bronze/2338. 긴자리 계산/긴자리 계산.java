import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String A = sc.nextLine();
        BigInteger big_a = new BigInteger(A);
        String B = sc.nextLine();
        BigInteger big_b = new BigInteger(B);
        
        System.out.println(big_a.add(big_b));
        System.out.println(big_a.subtract(big_b));
        System.out.println(big_a.multiply(big_b));
    }
}