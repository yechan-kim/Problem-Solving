import java.io.*;

public class Main {

    static int[][] sudoku = new int[9][9];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0; i<9; i++) {
            String[] str = br.readLine().split(" ");
            for(int j=0; j<9; j++) {
                sudoku[i][j] = Integer.parseInt(str[j]);
            }
        }

        br.close();

        solve();

        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                bw.write(sudoku[i][j] + " ");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    private static boolean solve() {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (sudoku[row][col] == 0) {
                    for (int num = 1; num <= 9; num++) {
                        if (isValid(row, col, num)) {
                            sudoku[row][col] = num;

                            if (solve()) {
                                return true;
                            }

                            sudoku[row][col] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(int row, int col, int num) {
        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i] == num) {
                return false;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == num) {
                return false;
            }
        }

        int boxRow = (row / 3) * 3;
        int boxCol = (col / 3) * 3;
        for (int i = boxRow; i < boxRow + 3; i++) {
            for (int j = boxCol; j < boxCol + 3; j++) {
                if (sudoku[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }
}
