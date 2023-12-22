import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> arr = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        String[] input = bf.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        int i;
        for (i = 0; i < N; i++)
            arr.add(i + 1);

        StringBuilder sb = new StringBuilder();
        sb.append('<');

        while (arr.size() > 1) {

            for (i = 0; i < K - 1; i++) {
                int val = arr.poll();
                arr.offer(val);
            }

            sb.append(arr.poll()).append(", ");
        }

        sb.append(arr.poll()).append('>');
        System.out.println(sb);

        bw.flush();
        bw.close();
        bf.close();
    }
}