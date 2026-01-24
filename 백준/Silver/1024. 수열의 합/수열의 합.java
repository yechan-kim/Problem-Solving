import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        while (true) {
            int min = n / l - ((l - 1) / 2);

            if (min < 0 || l > 100) {
                bw.write("-1\n");
                break;
            }

            int sum = (min * 2 + l - 1) * l / 2;

            if (sum == n) {
                for (int i = 0; i < l; i++) {
                    bw.write(min + i + " ");
                }
                break;
            }

            l++;

        }

        bw.flush();
        bw.close();
    }
}
