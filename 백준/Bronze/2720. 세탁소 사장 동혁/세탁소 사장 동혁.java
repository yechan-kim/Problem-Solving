import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] result = new int[4];

        for (int i = 0; i < T; i++) {
            int C = sc.nextInt();

            result[0] = C / 25;
            result[1] = (C % 25) / 10;
            result[2] = ((C % 25) % 10) / 5;
            result[3] = ((C % 25) % 10) % 5;

            for (int j = 0; j < 4; j++) {
                System.out.print(result[j] + " ");
            }
            System.out.println();
        }
    }
}