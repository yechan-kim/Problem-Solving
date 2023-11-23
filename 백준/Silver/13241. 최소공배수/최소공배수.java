import java.util.*;

public class Main {
    public static long gcd(long a, long b) {
        if (b == 0)
            return a;
        else return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long A = scan.nextLong();
        long B = scan.nextLong();

        System.out.println(A * B / gcd(A, B));
    }
}