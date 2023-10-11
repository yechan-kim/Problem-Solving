import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int i = 1;
        int num = 1;

        while (true) {
            if (N <= num)
            {
                System.out.println(i);
                break;
            }
            num += 6 * i;
            i++;
        }
    }
}