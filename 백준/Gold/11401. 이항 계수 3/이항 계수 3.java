import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        bw.write(binCoefficient(n, k) + "\n");

        bw.flush();
        bw.close();
    }

    private static long binCoefficient(int n, int k) {
        long MOD = 1_000_000_007;

        // 분자
        long numerator = 1;
        for (int i = n - k + 1; i <= n; i++) {
            numerator = (numerator * i) % MOD;
        }

        // 분모
        long denominator = 1;
        for (int i = 1; i <= k; i++) {
            denominator = (denominator * i) % MOD;
        }

        // 분모의 모듈러 역원을 구해서 곱셈으로 처리
        // (a / b) mod p = (a * b^(p-1)) mod p (페르마의 소정리)
        return (numerator * modularInverse(denominator, MOD)) % MOD;
    }

    // 모듈러 역원 계산 (페르마의 소정리 이용)
    private static long modularInverse(long n, long mod) {
        long result = 1;
        long exp = mod - 2;

        n %= mod;

        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * n) % mod;
            }
            n = (n * n) % mod;
            exp /= 2;
        }

        return result;
    }
}
