import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        long c = Integer.parseInt(st.nextToken());

        bw.write(pow(a, b, c) + "\n");

        bw.flush();
        bw.close();
    }

    public static long pow(long a, long b, long c) {
        if (b == 0) {
            return 1;
        }

        long temp = pow(a, b / 2, c);

        if (b % 2 == 0) {
            return (temp * temp) % c;
        }

        return (temp * temp % c * a % c) % c;
    }
}
