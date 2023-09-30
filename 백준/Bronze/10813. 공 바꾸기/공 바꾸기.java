import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] arr = new int[N];

        for (int l = 0; l < N; l++) {
            arr[l] = l + 1;
        }

        for (int l = 0; l < M; l++) {
            int i = scan.nextInt();
            int j = scan.nextInt();

            int tmp = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = tmp;
        }
        for (int l = 0; l < N; l++) {
            System.out.print(arr[l] + " ");
        }
    }
}