import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num[] = new int[9];
        for (int i = 0; i < 9; i++)
            num[i] = scan.nextInt();

        int max = Arrays.stream(num).max().getAsInt();

        for (int i = 0; i < 9; i++) {
            if (num[i] == max) {
                System.out.println(max);
                System.out.println(i + 1);
                break;
            }
        }
    }
}