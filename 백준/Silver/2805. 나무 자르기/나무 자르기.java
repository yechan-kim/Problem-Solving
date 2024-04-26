import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] tree = new int[N];

        int min = 0;
        int max = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            tree[i] = Integer.parseInt(st.nextToken());

            if (max < tree[i]) {
                max = tree[i];
            }
        }

        while (min < max) {
            int mid = (min + max) / 2;
            long sum = 0;
            for (int treeHeight : tree) {
                if (treeHeight - mid > 0) {
                    sum += (treeHeight - mid);
                }
            }

            if (sum < M) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        bw.write(String.valueOf(min-1));

        bw.flush();
        bw.close();
        br.close();
    }
}