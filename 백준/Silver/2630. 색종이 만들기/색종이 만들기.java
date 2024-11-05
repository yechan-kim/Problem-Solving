import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static int[][] matrix;
    private static int white = 0;
    private static int blue = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            
            for (int j = 0; j < N; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0, N);

        bw.write(white + "\n");
        bw.write(blue + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    private static void dfs(int x, int y, int size) {
        if (checkColor(x, y, size)) {
            if (matrix[y][x] == 1) {
                blue++;
            } else {
                white++;
            }
            return;
        }

        int newSize = size / 2;

        dfs(x, y, newSize);
        dfs(x + newSize, y, newSize);
        dfs(x, y + newSize, newSize);
        dfs(x + newSize, y + newSize, newSize);
    }

    private static boolean checkColor(int x, int y, int size) {
        int color = matrix[y][x];

        for (int i = y; i < y + size; i++) {
            for (int j = x; j < x + size; j++) {
                if (matrix[i][j] != color) {
                    return false;
                }
            }
        }

        return true;
    }
}
