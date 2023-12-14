import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bf.readLine());

        boolean[] num = new boolean[1000001];
        num[0] = num[1] = true;
        for (int i = 2; i * i <= 1000000; i++) {
            if (!num[i]) {
                for (int j = i + i; j <= 1000000; j += i) {
                    num[j] = true;
                }
            }
        }

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(bf.readLine());
            int ans = 0;
            for (int j = 2; j <= N / 2; j++) {
                if (!num[j] && !num[N - j]) ans++;
            }
            bw.write(Integer.toString(ans));
            bw.newLine();
        }

        bf.close();
        bw.flush();
        bw.close();
    }
}