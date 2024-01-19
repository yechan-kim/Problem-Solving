import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Queue<Integer> queue = new LinkedList<>();

            for (int j = 0; j < input[0]; j++)
                queue.add(arr[j]);

            int count = 1;
            while (true) {
                int max = queue.stream().max(Integer::compare).get();
                int front = queue.poll();
                if (front == max) {
                    if (input[1] == 0) {
                        System.out.println(count);
                        break;
                    }
                    input[1]--;
                    count++;
                } else {
                    queue.add(front);
                    if (input[1] == 0)
                        input[1] = queue.size() - 1;
                    else
                        input[1]--;
                }
            }
        }

        br.close();
    }
}