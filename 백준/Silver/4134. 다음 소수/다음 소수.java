import java.util.*;

public class Main {
    public static boolean isPrime(long num) {
        if (num < 2) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long nextPrime(long n) {
        while (!isPrime(n)) {
            n++;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            long n = scan.nextLong();
            System.out.println(nextPrime(n));
        }
    }
}