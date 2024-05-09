import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger result = BigInteger.ZERO;
        String A = st.nextToken();
        String B = st.nextToken();

        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < B.length(); j++) {
                result = result.add(BigInteger.valueOf((long) (A.charAt(i) - '0') * (B.charAt(j) - '0')));
            }
        }

        bw.write(result + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}