import java.io.*;

public class Main {

    private static int[] arr;
    private static Integer[] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n + 1];
        dp = new Integer[n + 1];
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        dp[1] = arr[1];

        if (n > 1) {
            dp[2] = arr[1] + arr[2];
        }

        bw.write(recur(n) + "\n");

        bw.flush();
        bw.close();
    }

    private static int recur(int n) {

        if (dp[n] == null) {
            dp[n] = Math.max(Math.max(recur(n - 2) + arr[n], recur(n - 3) + arr[n - 1] + arr[n]), recur(n - 1));
        }

        return dp[n];
    }
}
