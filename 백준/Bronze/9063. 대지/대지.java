import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[][] arr = new int[2][N];

        for (int i = 0; i < N; i++) {
            arr[0][i] = scan.nextInt();
            arr[1][i] = scan.nextInt();
        }

        int min_x = Arrays.stream(arr[0]).min().getAsInt();
        int max_x = Arrays.stream(arr[0]).max().getAsInt();
        int min_y = Arrays.stream(arr[1]).min().getAsInt();
        int max_y = Arrays.stream(arr[1]).max().getAsInt();

        System.out.println((max_x - min_x) * (max_y - min_y));
    }
}