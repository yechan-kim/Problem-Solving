import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        BigInteger factorial = BigInteger.valueOf(1);

        for (int i = 1; i <= N; i++)
            factorial = factorial.multiply(BigInteger.valueOf(i));

        String result = String.valueOf(factorial);
        for (int i = result.length() - 1; i >= 0; i--) {
            if (result.charAt(i) != '0') {
                bw.write(String.valueOf(result.length() - i - 1));
                break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}