import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++)
            arr[i] = scan.nextInt();

        arr = Arrays.stream(arr).sorted().toArray();

        int avg = (int) Arrays.stream(arr).average().getAsDouble();

        System.out.println(avg);
        System.out.println(arr[5 / 2]);
    }
}