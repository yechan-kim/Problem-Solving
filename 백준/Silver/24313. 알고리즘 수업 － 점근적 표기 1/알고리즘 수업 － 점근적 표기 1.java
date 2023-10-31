import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a1 = scan.nextInt();
        int a0 = scan.nextInt();
        int c = scan.nextInt();
        int n0 = scan.nextInt();

        if (a1 <= c && a0 <= n0 * (c - a1))
            System.out.println('1');
        else
            System.out.println('0');
    }
}