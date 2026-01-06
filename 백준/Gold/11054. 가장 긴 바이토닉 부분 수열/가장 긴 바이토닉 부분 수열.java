import java.io.*;
import java.util.StringTokenizer;

public class Main {

    private static int[] arr;
    private static Integer[] dp;
    private static Integer[] dpRev;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        dp = new Integer[n];
        dpRev = new Integer[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            recur(i);
            recurRev(i);
        }

        int max = dp[0] + dpRev[0];

        for (int i = 0; i < n; i++) {
            max = Math.max(max, dp[i] + dpRev[i]);
        }

        bw.write(max - 1 + "\n");

        bw.flush();
        bw.close();
    }

    private static int recur(int n) {

        if (dp[n] == null) {
            dp[n] = 1;

            for (int i = n - 1; i >= 0; i--) {
                if (arr[i] < arr[n]) {
                    dp[n] = Math.max(dp[n], recur(i) + 1);
                }
            }
        }

        return dp[n];
    }

    private static int recurRev(int n) {

        if (dpRev[n] == null) {
            dpRev[n] = 1;

            for (int i = n + 1; i < arr.length; i++) {
                if (arr[i] < arr[n]) {
                    dpRev[n] = Math.max(dpRev[n], recurRev(i) + 1);
                }
            }
        }

        return dpRev[n];
    }
}
