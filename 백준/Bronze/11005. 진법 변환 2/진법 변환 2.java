import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (N > 0) {
            int i = 0;
            int r = N % B;

            if (r < 10) {
                sb.append(r);
            } else {
                sb.append((char) (r - 10 + 'A'));
            }

            N /= B;
        }

        System.out.println(sb.reverse());
    }
}