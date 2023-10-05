import java.util.Scanner;

import static java.lang.Math.max;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();

        int max = max(flip(A), flip(B));
        System.out.println(max);
    }

    public static int flip(int num) {
        int result = 0;
        while (num != 0) {
            result = result * 10 + num % 10;
            num /= 10;
        }
        return result;
    }
}