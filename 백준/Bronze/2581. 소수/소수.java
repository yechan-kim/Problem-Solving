import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int M = scan.nextInt();
        int N = scan.nextInt();
        int sum = 0;
        int min = 10000;

        for (int i = M; i <= N; i++) {
            int[] arr = new int[i + 1];

            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    arr[j] = j;
            }

            if (Arrays.stream(arr).sum() == 1 + i) {
                sum += i;
                if (min > i)
                    min = i;
            }
        }

        if (min != 10000) {
            System.out.println(sum);
            System.out.println(min);
        } else
            System.out.println(-1);
    }
}