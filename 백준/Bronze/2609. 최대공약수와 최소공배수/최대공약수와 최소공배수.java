import java.util.Scanner;

public class Main {
    public static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }

    public static int lcm(int num1, int num2, int gcd) {
        return num1 * num2 / gcd;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int gcd = gcd(num1, num2);
        int lcm = lcm(num1, num2, gcd);
        
        System.out.println(gcd);
        System.out.println(lcm);
    }
}