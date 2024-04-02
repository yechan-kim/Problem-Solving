import java.io.*;
import java.util.*;

public class Main {

    public static int MAX = Integer.MIN_VALUE;
    public static int MIN = Integer.MAX_VALUE;
    public static int[] op = new int[4];
    public static int[] number;
    public static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        number = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) {
            op[i] = Integer.parseInt(st.nextToken());
        }

        dfs(number[0], 1);

        sb.append(MAX).append("\n").append(MIN);
        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
        br.close();
    }

    public static void dfs(int num, int index) {
        if (index == N) {
            MAX = Math.max(MAX, num);
            MIN = Math.min(MIN, num);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (op[i] > 0) {

                op[i]--;

                switch (i) {
                    case 0: {
                        dfs(num + number[index], index + 1);
                        break;
                    }
                    case 1: {
                        dfs(num - number[index], index + 1);
                        break;
                    }
                    case 2: {
                        dfs(num * number[index], index + 1);
                        break;
                    }
                    case 3: {
                        dfs(num / number[index], index + 1);
                        break;
                    }
                }

                op[i]++;
            }
        }
    }
}