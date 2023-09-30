import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] arr = new int[N];

        for (int l = 0; l < M; l++) {
            int i = scan.nextInt();
            int j = scan.nextInt();
            int k = scan.nextInt();

            for (int m = i - 1; m < j; m++) {
                arr[m] = k;
            }
        }
        for (int l = 0; l < N; l++) {
            System.out.print(arr[l] + " ");
        }
    }
}