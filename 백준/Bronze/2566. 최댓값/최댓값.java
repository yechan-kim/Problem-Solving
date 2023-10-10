import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matrix = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        int[] max_arr = new int[9];
        for (int i = 0; i < 9; i++)
            max_arr[i] = Arrays.stream(matrix[i]).max().getAsInt();
        int max = Arrays.stream(max_arr).max().getAsInt();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (matrix[i][j] == max) {
                    System.out.println(max);
                    System.out.println((i + 1) + " " + (j + 1));
                    return;
                }
            }
        }
    }
}