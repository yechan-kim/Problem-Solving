import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int n = scan.nextInt();
            if (n == -1)
                break;

            int arr[] = new int[n];
            int index = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    arr[index] = i;
                    index++;
                }
            }

            if (n == Arrays.stream(arr).sum() - n) {
                System.out.printf("%d = ", n);
                for (int i = 0; i < index - 1; i++) {
                    if (i != index - 2)
                        System.out.printf("%d + ", arr[i]);
                    else
                        System.out.printf("%d\n", arr[i]);
                }
            } else
                System.out.println(n + " is NOT perfect.");

        }
    }
}