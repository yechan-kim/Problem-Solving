import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        int N = Scan.nextInt();

        while (N != 1) {
            for (int i = 2; i <= N; i++) {
                if (N % i == 0) {
                    N /= i;
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}