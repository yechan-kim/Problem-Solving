import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 1; i <= N; i++) {
            if (N == i + i / 1000000 + i / 100000 - i / 1000000 * 10 + i / 10000 - i / 100000 * 10 + i / 1000 - i / 10000 * 10 + i / 100 - i / 1000 * 10 + i / 10 - i / 100 * 10 + i % 10) {
                System.out.println(i);
                break;
            }
            if (i == N)
                System.out.println(0);
        }
    }
}