import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static int[][] board;
    public static int negative = 0;
    public static int zero = 0;
    public static int positive = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        br.close();

        partition(0, 0, N);

        bw.write(negative + "\n");
        bw.write(zero + "\n");
        bw.write(positive + "\n");

        bw.flush();
        bw.close();
    }

    public static void partition(int row, int col, int size) {

        if (validate(row, col, size)) {
            if (board[row][col] == -1) {
                negative++;
                return;
            }
            
            if (board[row][col] == 0) {
                zero++;
                return;
            }
            
            positive++;
            return;
        }

        int newSize = size / 3;

        partition(row, col, newSize);
        partition(row, col + newSize, newSize);
        partition(row, col + 2 * newSize, newSize);

        partition(row + newSize, col, newSize);
        partition(row + newSize, col + newSize, newSize);
        partition(row + newSize, col + 2 * newSize, newSize);

        partition(row + 2 * newSize, col, newSize);
        partition(row + 2 * newSize, col + newSize, newSize);
        partition(row + 2 * newSize, col + 2 * newSize, newSize);

    }

    public static boolean validate(int row, int col, int size) {
        int num = board[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (num != board[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
