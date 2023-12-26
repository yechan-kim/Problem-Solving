import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out), 8192);

        int N = Integer.parseInt(bf.readLine());
        int[] A = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] B = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int M = Integer.parseInt(bf.readLine());
        int[] C = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Deque<Integer> deque = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            if (A[i] == 0)
                deque.addLast(B[i]);
        }

        for (int i = 0; i < M; i++) {
            deque.addFirst(C[i]);
            bw.write(deque.pollLast() + " ");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        bf.close();
    }
}