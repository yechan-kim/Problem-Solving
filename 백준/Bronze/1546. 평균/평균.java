import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        double[] num = new double[N];

        for (int i = 0; i < N; i++)
            num[i] = scan.nextInt();

        double max = Arrays.stream(num).max().getAsDouble();

        for (int i = 0; i < N; i++)
            num[i] = num[i] / max * 100;
        System.out.printf("%f ", Arrays.stream(num).average().getAsDouble());
    }
}