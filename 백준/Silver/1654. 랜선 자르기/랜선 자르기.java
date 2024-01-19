import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr = new int[input[0]];

        for (int i = 0; i < input[0]; i++)
            arr[i] = Integer.parseInt(br.readLine());

        long start = 1;
        long end = Arrays.stream(arr).max().getAsInt();
        long mid = (end + start) / 2;
        long result = end;

        while (end >= start) {
            int sum = 0;
            for (int i = 0; i < input[0]; i++) {
                sum += arr[i] / mid;
                if (sum > input[1])
                    break;
            }

            if (sum >= input[1]) {
                start = mid + 1;
                result = mid;
            } else
                end = mid - 1;

            mid = (end + start) / 2;
        }

        System.out.println(result);

        br.close();
    }
}