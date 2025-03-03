import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");

        int N = Integer.parseInt(inputs[0]);
        int K = Integer.parseInt(inputs[1]);

        bw.write(bfs(N, K) + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    private static int bfs(int N, int K) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(N);

        int[] visited = new int[100001];
        visited[N] = 1;

        int n;

        while (!queue.isEmpty()) {
            n = queue.remove();

            if (n == K) {
                return visited[n] - 1;
            }

            if (n - 1 >= 0 && visited[n - 1] == 0) {
                visited[n - 1] = visited[n] + 1;
                queue.add(n - 1);
            }

            if (n + 1 <= 100000 && visited[n + 1] == 0) {
                visited[n + 1] = visited[n] + 1;
                queue.add(n + 1);
            }

            if (2 * n <= 100000 && visited[2 * n] == 0) {
                visited[2 * n] = visited[n] + 1;
                queue.add(2 * n);
            }
        }

        return -1;
    }
}
