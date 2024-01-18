import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        if (N == 0) {
            System.out.println(0);
            return;
        }

        int[] arr = new int[N];

        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int sum = 0;
        for (int i = (int) Math.round(arr.length * 0.15); i < arr.length - (int) Math.round(arr.length * 0.15); i++)
            sum += arr[i];

        System.out.println((int) Math.round((double) sum / (arr.length - (int) Math.round(arr.length * 0.15) * 2.0)));

        br.close();
    }
}