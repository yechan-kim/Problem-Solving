import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                int num = Integer.parseInt(st.nextToken());

                if (pq.size() < n) {
                    pq.add(num);
                    continue;
                }
                
                if (pq.peek() < num) {
                    pq.poll();
                    pq.add(num);
                }
            }
        }

        bw.write(pq.peek() + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
