import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();
        int arr[] = new int[N + 1];
        int idx = 1;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                arr[idx] = i;
                idx++;
            }
        }

        System.out.println(arr[K]);
    }
}