import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        int num[] = new int[N + 1];
        for (int i = 1; i <= N; i++)
            num[i] = i;
        int tmp = 0;

        for (int k = 0; k < M; k++) {
            int i = scan.nextInt();
            int j = scan.nextInt();
            for (int l = 0; l < (j - i + 1) / 2; l++) {
                tmp = num[i + l];
                num[i + l] = num[j - l];
                num[j - l] = tmp;
            }
        }

        for (int i = 1; i <= N; i++)
            System.out.print(num[i] + " ");
    }
}