import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[3];

        for (int i = 0; i < 3; i++)
            arr[i] = sc.nextInt();

        int mul = arr[0] * arr[1] * arr[2];

        int count[] = new int[10];
        while (mul > 0) {
            count[mul % 10]++;
            mul /= 10;
        }

        for (int i = 0; i < 10; i++)
            System.out.println(count[i]);
    }
}