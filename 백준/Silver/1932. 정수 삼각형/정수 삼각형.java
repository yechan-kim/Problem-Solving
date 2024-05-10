import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] triangle = new int[n][n];
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            dp[n - 1][i] = triangle[n - 1][i];
        }

        bw.write(findMax(triangle, dp, 0, 0) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    public static int findMax(int[][] triangle, int[][] dp, int depth, int idx) {
        if (depth == triangle.length - 1) {
            return dp[depth][idx];
        }

        if (dp[depth][idx] == 0) {
            dp[depth][idx] = Math.max(findMax(triangle, dp, depth + 1, idx), findMax(triangle, dp, depth + 1, idx + 1)) + triangle[depth][idx];
        }

        return dp[depth][idx];
    }
}