import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int t = 0; t < 3; t++) {
            int N = Integer.parseInt(br.readLine());

            BigInteger S = BigInteger.ZERO;
            for (int i = 0; i < N; i++) {
                S = S.add(new BigInteger(br.readLine()));
            }

            if (S.compareTo(BigInteger.ZERO) > 0) {
                bw.write("+\n");
            } else if (S.compareTo(BigInteger.ZERO) < 0) {
                bw.write("-\n");
            } else {
                bw.write("0\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}