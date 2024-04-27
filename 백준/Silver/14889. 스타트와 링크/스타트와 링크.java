import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int Min = Integer.MAX_VALUE;
    static int map[][];
    static boolean visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        map = new int[N][N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solve(0, 0);

        bw.write(Min + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    public static void solve(int idx, int count) {
        if (count == N / 2) {
            getDiff();
            return;
        }

        for (int i = idx; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                solve(i + 1, count + 1);
                visited[i] = false;
            }
        }
    }

    public static void getDiff() {
        int start = 0;
        int link = 0;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {

                if (visited[i] && visited[j]) {
                    start += map[i][j];
                    start += map[j][i];
                } else if (!visited[i] && !visited[j]) {
                    link += map[i][j];
                    link += map[j][i];
                }
            }
        }

        int val = Math.abs(start - link);

        if (val == 0) {
            System.out.println(val);
            System.exit(0);
        }

        Min = Math.min(val, Min);
    }
}