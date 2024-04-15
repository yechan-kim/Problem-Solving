import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] S = new int[n];

        for (int i = 0; i < n; i++) {
            S[i] = Integer.parseInt(br.readLine());
        }

        bw.write(change(k, n, S) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    public static int change(int N, int l, int[] S) {
        int[] dp = new int[N + 1];
        dp[0] = 1;

        for (int i = 0; i < l; i++) {
            for (int j = S[i]; j <= N; j++) {
                dp[j] += dp[j - S[i]];
            }
        }

        return dp[N];
    }
}