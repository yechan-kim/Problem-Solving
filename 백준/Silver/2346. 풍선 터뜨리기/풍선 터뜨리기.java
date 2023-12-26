import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<int[]> deq = new ArrayDeque<>();
        int N = Integer.parseInt(bf.readLine());
        int[] input = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        StringBuilder sb = new StringBuilder();
        
        sb.append("1 ");
        int in = input[0];

        for (int i = 1; i < N; i++)
            deq.add(new int[]{(i + 1), input[i]});

        while (!deq.isEmpty()) {
            if (in > 0) {
                for (int i = 1; i < in; i++)
                    deq.add(deq.poll());

                int[] nxt = deq.poll();
                in = nxt[1];
                sb.append(nxt[0] + " ");
            } else {
                for (int i = 1; i < -in; i++)
                    deq.addFirst(deq.pollLast());

                int[] nxt = deq.pollLast();
                in = nxt[1];
                sb.append(nxt[0] + " ");
            }
        }

        System.out.println(sb.toString());

        bw.flush();
        bw.close();
        bf.close();
    }
}
