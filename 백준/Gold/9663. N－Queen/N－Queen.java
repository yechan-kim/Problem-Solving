import java.io.*;

public class Main {
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;
    static int[] Col;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        Col = new int[N];

        queens(0);

        bw.write(count + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    static void queens(int row) {
        if (row == N) {
            count++;
            return;
        }

        for (int i = 0; i < N; i++) {
            Col[row] = i;
            if (promising(row)) {
                queens(row + 1);

            }
        }
    }

    static boolean promising(int num) {
        for (int i = 0; i < num; i++) {
            if (Col[i] == Col[num] || Math.abs(Col[i] - Col[num]) == num - i) {
                return false;
            }
        }
        return true;
    }
}