import java.io.*;

public class Main {
    public static int N;
    public static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;

        while ((str = br.readLine()) != null) {
            N = Integer.parseInt(str);
            sb = new StringBuilder();
            int len = (int) Math.pow(3, N);

            for (int i = 0; i < len; i++) {
                sb.append("-");
            }

            split(0, len);
            bw.write(sb.toString() + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static void split(int start, int size) {
        if (size == 1) {
            return;
        }

        int newSize = size / 3;
        for (int i = start + newSize; i < start + 2 * newSize; i++) {
            sb.setCharAt(i, ' ');
        }

        split(start, newSize);
        split(start + 2 * newSize, newSize);
    }
}