import java.util.*;

public class Main {
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int S_A = scan.nextInt();
        int M_A = scan.nextInt();
        int S_B = scan.nextInt();
        int M_B = scan.nextInt();

        int numerator = S_A * M_B + S_B * M_A;
        int denominator = M_A * M_B;
        int commonGcd = gcd(numerator, denominator);

        System.out.println(numerator / commonGcd + " " + denominator / commonGcd);
    }
}