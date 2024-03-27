import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());

        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            long M = Long.parseLong(st.nextToken());
            long N = Long.parseLong(st.nextToken());
            BigInteger result = calculateBinomialCoefficient(N, M);
            bw.write(result + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static BigInteger calculateBinomialCoefficient(long n, long k) {
        BigInteger result = BigInteger.ONE;
        for (long i = 0; i < k; i++) {
            result = result.multiply(BigInteger.valueOf(n - i))
                    .divide(BigInteger.valueOf(i + 1));
        }
        return result;
    }
}
