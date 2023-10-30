import java.util.Scanner;

import static java.lang.Math.max;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int max = max(A, max(B, C));
        int result = max;

        while (true) {
            if (result >= A + B + C - max)
                result--;
            else {
                System.out.println(result + A + B + C - max);
                break;
            }
        }
    }
}