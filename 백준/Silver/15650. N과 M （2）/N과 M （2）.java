import java.io.*;
import java.util.*;

public class Main {
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();

    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        dfs(1, 0);

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }

    public static void dfs(int start, int depth) {
        if (depth == M) {
            for (int num : arr) {
                sb.append(num).append(' ');
            }

            sb.append("\n");
            return;
        }

        for (int i = start; i <= N; i++) {
            arr[depth] = i;
            dfs(i + 1, depth + 1);
        }
    }
}