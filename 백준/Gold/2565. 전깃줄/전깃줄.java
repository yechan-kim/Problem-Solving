import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    private static int[][] wire;
    private static Integer[] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        dp = new Integer[n];
        wire = new int[n][2];

        // 전깃줄 입력 A -> B
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            wire[i][0] = Integer.parseInt(st.nextToken());
            wire[i][1] = Integer.parseInt(st.nextToken());
        }

        br.close();

        // A 전봇대 기준 오름차순 정렬 (문제의 그림과 동등한 상황으로 변경)
        Arrays.sort(wire, Comparator.comparingInt(o -> o[0]));

        int max = 0;

        // LIS 알고리즘 적용: 겹치지 않는 와이어의 최대 개수 산정
        for (int i = 0; i < n; i++) {
            max = Math.max(max, lis(i));
        }

        bw.write(n - max + "\n");

        bw.flush();
        bw.close();
    }

    private static int lis(int n) {

        if (dp[n] == null) {
            dp[n] = 1; // 최소값 = 자기 자신 1개

            // 탐색 대상: A 전봇대에 n번 와이어 보다 아래에 걸려있는 와이어
            // 겹치지 않는 조건: B 전봇대애 n번 와이어보다 아래에 걸려있는 와이어
            for (int i = n + 1; i < dp.length; i++) {
                if (wire[i][1] > wire[n][1]) {
                    dp[n] = Math.max(dp[n], lis(i) + 1);
                }
            }
        }

        // n번째 전깃줄을 포함하는 LIS의 길이 반환
        return dp[n];
    }
}
