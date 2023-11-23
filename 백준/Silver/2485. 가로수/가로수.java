import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] trees = new int[n];

        for (int i = 0; i < n; i++)
            trees[i] = scanner.nextInt();

        int[] gaps = new int[n - 1];
        for (int i = 0; i < n - 1; i++)
            gaps[i] = trees[i + 1] - trees[i];

        int gcdValue = gaps[0];
        for (int i = 1; i < n - 1; i++)
            gcdValue = gcd(gcdValue, gaps[i]);

        int result = 0;
        for (int i = 0; i < n - 1; i++)
            result += (gaps[i] / gcdValue) - 1;

        System.out.println(result);
    }
}