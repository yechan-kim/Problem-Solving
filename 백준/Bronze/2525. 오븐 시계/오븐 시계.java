import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        A += C / 60;
        C %= 60;

        if (B + C >= 60) {
            A++;
            B = B + C - 60;
        } else
            B += C;

        if (A >= 24)
            A -= 24;

        System.out.println(A + " " + B);
    }
}