import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String base = "***\n" + "* *\n" + "***";
        int N = Integer.parseInt(st.nextToken());
        int size = log(N);

        bw.write(star(base, size - 1));

        bw.flush();
        bw.close();
        br.close();
    }

    public static int log(int n) {
        int num = 1;
        int cnt = 0;
        while (true) {
            cnt++;
            num *= 3;
            if (num == n) {
                return cnt;
            }
        }
    }

    public static String star(String base, int size) {
        if (size == 0) {
            return base;
        }

        String[] baseArr = base.split("\n");
        StringBuilder sb = new StringBuilder();

        for (String s : baseArr) {
            sb.append(s.repeat(3)).append("\n");
        }
        for (String s : baseArr) {
            sb.append(s).append(" ".repeat(s.length())).append(s).append("\n");
        }
        for (String s : baseArr) {
            sb.append(s.repeat(3)).append("\n");
        }

        return star(sb.toString(), size - 1);
    }
}