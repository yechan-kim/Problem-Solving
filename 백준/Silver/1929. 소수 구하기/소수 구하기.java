import java.util.*;

public class Main {
    public static boolean isPrime(int num) {
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

    public static void Prime(int M, int N) {
        for (int i = M; i <= N; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            int M = scan.nextInt();
            int N = scan.nextInt();
            Prime(M, N);
    }
}
