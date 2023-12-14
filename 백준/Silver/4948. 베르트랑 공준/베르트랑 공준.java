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

    public static int Prime(int n) {
        int cnt = 0;
        for (int i = n + 1; i <= 2 * n; i++) {
            if (isPrime(i))
                cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int n = scan.nextInt();
            if (n == 0)
                return;
            else
                System.out.println(Prime(n));
        }
    }
}