import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3, num4, num5;

        num3 = num1 * (num2 % 10);
        num4 = num1 * ((num2 % 100) / 10);
        num5 = num1 * (num2 / 100);

        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num3 + num4 * 10 + num5 * 100);
    }
}