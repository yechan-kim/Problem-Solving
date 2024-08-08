import java.io.*;

public class Main {

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        sb.append((int) (Math.pow(2, N) - 1)).append('\n');

        Hanoi(N, 1, 2, 3);
        
        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
        br.close();
    }

    public static void Hanoi(int N, int start, int mid, int to) {
        if (N == 1) {
            sb.append(start).append(" ").append(to).append("\n");
            return;
        }

        Hanoi(N - 1, start, to, mid);

        sb.append(start).append(" ").append(to).append("\n");

        Hanoi(N - 1, mid, start, to);
    }
}