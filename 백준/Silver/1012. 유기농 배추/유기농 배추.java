import java.io.*;
import java.util.StringTokenizer;

public class Main {

    private static int[][] map;
    private static boolean[][] visited;
    private static final int[] dx = {0, 1, 0, -1};
    private static final int[] dy = {-1, 0, 1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int cnt = 0;

            map = new int[N][M];
            visited = new boolean[N][M];

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine(), " ");

                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());

                map[Y][X] = 1;
            }

            for (int y = 0; y < N; y++) {
                for (int x = 0; x < M; x++) {
                    if (map[y][x] == 1 && !visited[y][x]) {
                        dfs(x, y);
                        cnt++;
                    }
                }
            }

            bw.write(cnt + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static void dfs(int x, int y) {
        visited[y][x] = true;

        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (nextX >= 0 && nextY >= 0 && nextX < map[0].length && nextY < map.length) {
                if (map[nextY][nextX] == 1 && !visited[nextY][nextX]) {
                    dfs(nextX, nextY);
                }
            }
        }
    }
}
