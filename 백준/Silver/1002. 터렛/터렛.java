import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            bw.write(getPointCount(x1, y1, r1, x2, y2, r2) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static int getPointCount(int x1, int y1, int r1, int x2, int y2, int r2) {
        if (x1 == x2 && y1 == y2 && r1 == r2) return -1;

        double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        if (distance > r1 + r2) return 0;
        if (distance < Math.abs(r1 - r2)) return 0;

        if (distance == r1 + r2) return 1;
        if (distance == Math.abs(r1 - r2)) return 1;

        return 2;
    }
}
