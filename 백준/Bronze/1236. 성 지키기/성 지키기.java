import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int row = 0;
        int col = 0;
        char[][] map = new char[N][M];

        for (int i = 0; i < map.length; i++) {
            String str = br.readLine();

            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < N; i++) {
            boolean flag = true;
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 'X') {
                    flag = false;
                    break;
                }
            }
            if (flag)
                row++;
        }

        for (int i = 0; i < M; i++) {
            boolean flag = true;
            for (int j = 0; j < N; j++) {
                if (map[j][i] == 'X') {
                    flag = false;
                    break;
                }
            }
            if (flag)
                col++;
        }

        bw.write(Math.max(row, col) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

}