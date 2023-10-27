import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cnt =0;
        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            int num = scan.nextInt();

            int arr[] = new int[num + 1];

            for (int j = 1; j <= num; j++) {
                if (num % j == 0)
                    arr[j] = j;
            }

            if(Arrays.stream(arr).sum()==num+1)
                cnt++;
        }

        System.out.println(cnt);
    }
}