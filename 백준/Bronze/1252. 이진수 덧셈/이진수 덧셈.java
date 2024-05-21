import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String num1 = st.nextToken();
        String num2 = st.nextToken();

        BigInteger num1Binary = new BigInteger(num1, 2);
        BigInteger num2Binary = new BigInteger(num2, 2);

        BigInteger sum = num1Binary.add(num2Binary);

        String sumBinary = sum.toString(2);

        bw.write(sumBinary + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}